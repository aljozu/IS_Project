package com.example.restbackend.service;

import com.example.restbackend.model.proyeccion.Proyeccion;
import com.example.restbackend.repositories.ProyeccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.util.retry.Retry;

import java.time.Duration;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ProyeccionService {

    private final ProyeccionRepository proyeccionRepository;
    private final WebClient webClient = WebClient.create("https://serene-lowlands-43370.herokuapp.com");

    @Autowired
    public ProyeccionService(ProyeccionRepository proyeccionRepository) {
        this.proyeccionRepository = proyeccionRepository;
    }
    
    public List<Proyeccion> getProyeccionesDb(){
        return proyeccionRepository.findAll();
    }

    public List<Proyeccion> getProyecciones() {
        getCursos();
        return proyeccionRepository.findAll();
    }

    public Proyeccion findOneByCursoCod(String cursoCod) {
        Optional<Proyeccion> proyeccionOptional = proyeccionRepository.findProyeccionByCursoCod(cursoCod);
        return proyeccionOptional.orElse(null);
    }

    private void getCursos(){
        List<Proyeccion> proyecciones = webClient.get()
                .uri("/courses?period=402")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<Proyeccion>>() {
                })
                .block();
        assert proyecciones != null;
        for(var p : proyecciones){
            if(p.getCursoId() != 2321) {
                var proyeccionOptional = proyeccionRepository.findProyeccionByCursoId(p.getCursoId());
                if (proyeccionOptional.isPresent()) {
                    var pro = proyeccionOptional.get();
                    pro.setCursoCod(p.getCursoCod());
                    pro.setAreaFunDesc(p.getAreaFunDesc());
                    pro.setCursoDesc(p.getCursoDesc());
                    pro.setAreaFunId(p.getAreaFunId());
                    pro.setNumAlumn((long) getNumAlumnos(pro));
                    proyeccionRepository.save(pro);
                } else {
                    p.setNumAlumn((long) getNumAlumnos(p));
                    proyeccionRepository.save(p);
                }
            }
        }
    }
    private double getNumAlumnos(Proyeccion proyeccion){
        String resultados = Objects.requireNonNull(webClient.get()
                    .uri("/predict?course=" + proyeccion.getCursoId() + "&period=402")
                    .retrieve()
                    .bodyToMono(String.class)
                    .retryWhen(Retry.fixedDelay(3, Duration.ofSeconds(35)))
                    .block());

        return parser(resultados);
    }

    private static double parser(String s){
        double cont = 0;
        StringBuilder r = new StringBuilder();
        for(int i = 7; i< s.length(); ++i){
            if(s.charAt(i) == ','){
                var a = Double.parseDouble(r.toString());
                cont += a;
                r.setLength(0);
            }else{
                r.append(s.charAt(i));
            }
        }
        return Math.ceil(cont);
    }

}

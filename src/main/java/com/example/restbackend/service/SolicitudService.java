package com.example.restbackend.service;

import com.example.restbackend.custom_exception.CustomException;
import com.example.restbackend.model.solicitud.Solicitud;
import com.example.restbackend.repositories.SolicitudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SolicitudService {
    private final SolicitudRepository solicitudRepository;

    @Autowired
    public SolicitudService(SolicitudRepository solicitudRepository){
        this.solicitudRepository = solicitudRepository;
    }

    public List<Solicitud> getAllSolicitudes(){
        return solicitudRepository.findAll();
    }

    public List<Solicitud> getAllSolicitudesbyEmail(String email){
        return  solicitudRepository.findSolicitudesByEmail(email);
    }

    public void addNewSolicitud(Solicitud solicitud) {
        solicitudRepository.save(solicitud);
    }

    public void updateSolicitudStatus(Long id, String status){
        var solicitud = solicitudRepository.findSolicitudesById(id)
                .orElseThrow(() -> new CustomException("La solicitud no se encontró"));
        solicitud.setStatus(status);
        solicitudRepository.save(solicitud);
    }

}

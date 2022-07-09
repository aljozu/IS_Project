package com.example.restbackend.controllers;

import com.example.restbackend.extra.PDFReader;
import com.example.restbackend.model.solicitud.Solicitud;
import com.example.restbackend.service.SolicitudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/solicitud")
public class SolicitudController {
    static final Logger logger = Logger.getLogger(SolicitudController.class.getName());

    private final SolicitudService solicitudService;

    @Autowired
    public SolicitudController(SolicitudService solicitudService){
        this.solicitudService = solicitudService;
    }

    @GetMapping(path = "/all")
    public List<Solicitud> getAllSolicitudes(){
        return solicitudService.getAllSolicitudes();
    }

    @GetMapping(path = "/solicitudesByEmail/{email}")
    public List<Solicitud> getSolicitudbyEmail(@PathVariable String email){
        return solicitudService.getAllSolicitudesbyEmail(email);
    }

    @PostMapping(path = "/addSolicitud")
    public void registerNewUsuario(@RequestBody Solicitud solicitud) {
        solicitudService.addNewSolicitud(solicitud);
    }

    @PutMapping(path = "/update/{id}/{status}")
    public void updateSolicitudByID(@PathVariable Long id, @PathVariable String status){
        solicitudService.updateSolicitudStatus(id, status);
    }

    @RequestMapping(path = "/addSolicitudFromPDF/**")
    public void createPDFSolitud(HttpServletRequest request) throws Exception {
        String fullUrl = request.getRequestURL().toString();
        String url = fullUrl.split("/addSolicitudFromPDF/")[1];
        PDFReader pdfReader = new PDFReader();
        Solicitud solicitud = pdfReader.readPDF(url);
        solicitudService.addNewSolicitud(solicitud);
    }
}

package com.example.restbackend.controllers;

import com.example.restbackend.extra.PDFReader;
import com.example.restbackend.model.solicitud.Solicitud;
import com.example.restbackend.service.SolicitudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(path = "/addSolicitudFromPDF/{path}")
    public void createPDFSolitud(@PathVariable String path) throws Exception {
        PDFReader pdfReader = new PDFReader();
        Solicitud solicitud = pdfReader.readPDF(path);
        solicitudService.addNewSolicitud(solicitud);
    }
}

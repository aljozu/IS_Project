package com.example.restbackend.controllers;

import com.example.restbackend.model.usuario.Usuario;
import com.example.restbackend.model.usuario_dto.UsuarioDTO;
import com.example.restbackend.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
@RequestMapping(path = "/admin")
public class AdminController {
    static final Logger logger = Logger.getLogger(AdminController.class.getName());
    private final UsuarioService usuarioService;

    @Autowired
    public AdminController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping(path = "/addUser")
    public void registerNewUsuario(@RequestBody Usuario usuario) {
        usuarioService.addNewUsuario(usuario);
    }

    @DeleteMapping(path = "/deleteByEmail/{userEmail}")
    public void deleteUsuarioByEmail(@PathVariable("userEmail") String userEmail ){
        usuarioService.deleteUsuario(userEmail);
    }

    @PutMapping(path = "/updateRole/{userEmail}")
    public void updateUsuarioByEmail(@PathVariable("userEmail") String userEmail, @RequestBody Usuario usuario){
        usuarioService.updateUsuarioRole(userEmail, usuario.getRole());
    }
}

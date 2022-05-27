package com.example.restbackend.controllers;

import com.example.restbackend.model.currentuser.CurrentUser;
import com.example.restbackend.model.usuario.Usuario;
import com.example.restbackend.service.UsuarioService;
import com.example.restbackend.model.currentuser.UserPrincipal;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProfileController {
    @Autowired
    private UsuarioService usuarioService;

    @RequestMapping("/profile")
    //@PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    //@PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    public Usuario currentUser(@CurrentUser UserPrincipal userPrincipal){
        return usuarioService.findOneByGoogleId(userPrincipal.getName());
    }
}

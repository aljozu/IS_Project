package com.example.restbackend.repositories;

import com.example.restbackend.model.usuario.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.testng.Assert;
import org.testng.annotations.Test;


@DataJpaTest
class UsuarioRepositoryTest {
/*
    @Autowired
    private UsuarioRepository underTest;

    @Test
    void findUsuarioByID() {
        long id = 1;
        var usuario = new Usuario("Usuario", "usuario@utec.edu.pe", "","Admin", "");
        underTest.save(usuario);
        var usuarioOptional = underTest.findUsuarioByID(id);
        var exists = false;
        if(usuarioOptional.isPresent())
            exists = true;

        Assert.assertTrue(exists);
    }

    @Test
    void findUsuarioByEmail() {
        var usuario = new Usuario("Usuario", "usuario@utec.edu.pe", "","Admin", "");
        underTest.save(usuario);
        var usuarioOptional = underTest.findUsuarioByEmail("usuario@utec.edu.pe");
        var exists = false;
        if(usuarioOptional.isPresent())
            exists = true;

        Assert.assertTrue(exists);
    }

    @Test
    void deleteUsuarioByEmail() {
        var usuario = new Usuario("Usuario", "usuario@utec.edu.pe", "","Admin", "");
        underTest.save(usuario);
        underTest.deleteUsuarioByEmail("usuario@utec.edu.pe");
        var usuarioOptional = underTest.findUsuarioByEmail("usuario@utec.edu.pe");
        var exists = false;
        if(usuarioOptional.isPresent())
            exists = true;

        Assert.assertTrue(exists);
    }

    @Test
    void findUsuarioByGoogleId() {
        var usuario = new Usuario("Usuario", "usuario@utec.edu.pe", "","Admin", "");
        underTest.save(usuario);
        underTest.deleteUsuarioByEmail("usuario@utec.edu.pe");
        var usuarioOptional = underTest.findUsuarioByGoogleId("");
        var exists = false;
        if(usuarioOptional.isPresent())
            exists = true;

        Assert.assertTrue(exists);
    }

 */
}
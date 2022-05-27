package com.example.restbackend.repositories;


import com.example.restbackend.model.proyeccion.Proyeccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.testng.Assert;
import org.testng.annotations.Test;


@DataJpaTest
class ProyeccionRepositoryTest {
/*
    @Autowired
    private ProyeccionRepository underTest;



    @Test
    void findProyeccionByID() {
        var proyeccion = new Proyeccion("AB2", "ADA", "CS", 45);
        underTest.save(proyeccion);
        var id = proyeccion.getId();
        var proyeccionOptional = underTest.findProyeccionByID(id);
        var exists = false;
        if(proyeccionOptional.isPresent())
            exists = true;

        Assert.assertTrue(exists);
    }

    @Test
    void findProyeccionByCodCur() {
        var proyeccion = new Proyeccion("AB2", "ADA", "CS", 45);
        underTest.save(proyeccion);
        var proyeccionOptional = underTest.findProyeccionByCodCur("AB2");
        var exists = false;
        if(proyeccionOptional.isPresent())
            exists = true;

        Assert.assertTrue(exists);
    }

    @Test
    void findProyeccionByNomCur() {
        var proyeccion = new Proyeccion("AB2", "ADA", "CS", 45);
        underTest.save(proyeccion);
        var proyeccionOptional = underTest.findProyeccionByNomCur("ADA");
        var exists = false;
        if(proyeccionOptional.isPresent())
            exists = true;

        Assert.assertTrue(exists);
    }

    @Test
    void findProyeccionByNomCarr() {
        var proyeccion = new Proyeccion("AB2", "ADA", "CS", 45);
        underTest.save(proyeccion);
        var proyeccionOptional = underTest.findProyeccionByNomCarr("CS");
        var exists = false;
        if(!proyeccionOptional.isEmpty())
            exists = true;

        Assert.assertTrue(exists);
    }
*/
}
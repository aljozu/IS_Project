package com.example.restbackend.service;

import com.example.restbackend.model.proyeccion.Proyeccion;
import com.example.restbackend.repositories.ProyeccionRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ProyeccionServiceTest {
/*
    @InjectMocks private ProyeccionService underTest;
    @Mock private ProyeccionRepository proyeccionRepository;

    @BeforeEach
    void setUp(){
        underTest = new ProyeccionService(proyeccionRepository);
    }

    @Test
    void getProyecciones() {
        underTest.getProyecciones();
        verify(proyeccionRepository.findAll());
    }

    @Test
    void findOneByCurCod() {
        when(underTest.findOneByCurCod("AB2")).thenReturn
                (new Proyeccion("AB2", "ADA", "CS", 45));
        var proyeccion = proyeccionRepository.findProyeccionByCodCur("AB2");
        Assert.assertEquals("AB2", proyeccion.get().getCodCurso());
    }

    @Test
    void findOneByCurCodd() {
        when(underTest.findOneByCurCod("AB2")).thenReturn
                (new Proyeccion("AB2", "ADA", "CS", 45));
        var proyeccion = proyeccionRepository.findProyeccionByCodCur("AB22");
        Assert.assertNull(proyeccion);
    }

    @Test
    void findProyeccionByNomCarr() {
        when(underTest.findOneByCurCod("AB2")).thenReturn
                (new Proyeccion("AB2", "ADA", "CS", 45));
        var proyeccion = proyeccionRepository.findProyeccionByNomCarr("CS");
        Assert.assertNotNull(proyeccion);
    }

 */
}
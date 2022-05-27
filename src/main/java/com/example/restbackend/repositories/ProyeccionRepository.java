package com.example.restbackend.repositories;

import com.example.restbackend.model.proyeccion.Proyeccion;
import com.example.restbackend.model.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;

@Repository
public interface ProyeccionRepository extends JpaRepository<Proyeccion, Long> {
    @Query("SELECT s FROM Proyeccion s WHERE s.cursoId = ?1")
    Optional<Proyeccion> findProyeccionByCursoId(Long cursoId);

    @Query("SELECT s FROM Proyeccion s WHERE s.cursoCod = ?1")
    Optional<Proyeccion> findProyeccionByCursoCod(String cursoCod);

    @Query("SELECT s FROM Proyeccion s WHERE s.cursoDesc = ?1")
    Optional<Proyeccion> findProyeccionByCursoDesc(String cursoDesc);
}

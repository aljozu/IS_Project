package com.example.restbackend.repositories;

import com.example.restbackend.model.solicitud.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SolicitudRepository extends JpaRepository<Solicitud, Long> {
    @Query("SELECT s FROM Solicitud s WHERE s.email = ?1")
    List<Solicitud> findSolicitudesByEmail(String email);

    @Query("SELECT s FROM Solicitud s WHERE s.id = ?1")
    Optional<Solicitud> findSolicitudesById(Long id);
}

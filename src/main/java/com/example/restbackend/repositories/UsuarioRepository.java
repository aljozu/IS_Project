package com.example.restbackend.repositories;

import com.example.restbackend.model.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Query("SELECT s FROM Usuario s WHERE s.email = ?1")
    Optional<Usuario> findUsuarioByEmail(String email);

    @Transactional
    @Modifying
    @Query("DELETE FROM Usuario s WHERE s.email = ?1")
    void deleteUsuarioByEmail(String email);

    @Query("SELECT s FROM Usuario s WHERE s.googleId = ?1")
    Optional<Usuario> findUsuarioByGoogleId(String googleId);
}

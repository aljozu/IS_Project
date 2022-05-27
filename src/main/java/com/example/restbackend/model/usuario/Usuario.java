package com.example.restbackend.model.usuario;

import com.example.restbackend.model.usuario_dto.UsuarioDTO;

import javax.persistence.*;

@Entity
@Table
public class Usuario {

    @Id
    private String email;
    @Column(nullable = true)
    private String name;
    @Column(nullable = true)
    private String imageUrl;
    @Column(nullable = true)
    private String role;
    @Column
    private String googleId;

    public Usuario(){}

    public Usuario(String email, String role){
        this.email = email;
        this.role = role;
    }

    public Usuario( String name, String email, String imageUrl, String role, String googleId) {
        this.name = name;
        this.email = email;
        this.imageUrl = imageUrl;
        this.role = role;
        this.googleId = googleId;
    }

    public Usuario(UsuarioDTO userDTO){
        this.name = userDTO.getNameDTO();
        this.email = userDTO.getEmailDTO();
        this.imageUrl = userDTO.getImageUrlDTO();
        this.role = userDTO.getRoleDTO();
        this.googleId = userDTO.getGoogleIdDTO();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public String getImageUrl() { return imageUrl; }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getGoogleId() {
        return googleId;
    }

    public void setGoogleId(String googleId) {
        this.googleId = googleId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona : " +  ", nombre =  " + name + ", email = " + email + " role: " + role;
    }
}

package com.upc.curso.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class UsuarioDTO {
    private Long dni_usuario;
    private String nombre_usuario;
    private String apellido_usuario;
    private String correo_usuario;
    private Long contraseña_usuario;

    public UsuarioDTO(Long dni_usuario, String nombre_usuario, String apellido_usuario, String correo_usuario, Long contraseña_usuario) {
        this.dni_usuario = dni_usuario;
        this.nombre_usuario = nombre_usuario;
        this.apellido_usuario = apellido_usuario;
        this.correo_usuario = correo_usuario;
        this.contraseña_usuario = contraseña_usuario;
    }

    public Long getDni_usuario() {
        return dni_usuario;
    }

    public void setDni_usuario(Long dni_usuario) {
        this.dni_usuario = dni_usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getApellido_usuario() {
        return apellido_usuario;
    }

    public void setApellido_usuario(String apellido_usuario) {
        this.apellido_usuario = apellido_usuario;
    }

    public String getCorreo_usuario() {
        return correo_usuario;
    }

    public void setCorreo_usuario(String correo_usuario) {
        this.correo_usuario = correo_usuario;
    }

    public Long getContraseña_usuario() {
        return contraseña_usuario;
    }

    public void setContraseña_usuario(Long contraseña_usuario) {
        this.contraseña_usuario = contraseña_usuario;
    }

    @Override
    public String toString() {
        return "UsuarioDTO{" +
                "dni_usuario=" + dni_usuario +
                ", nombre_usuario='" + nombre_usuario + '\'' +
                ", apellido_usuario='" + apellido_usuario + '\'' +
                ", correo_usuario='" + correo_usuario + '\'' +
                ", contraseña_usuario=" + contraseña_usuario +
                '}';
    }
}

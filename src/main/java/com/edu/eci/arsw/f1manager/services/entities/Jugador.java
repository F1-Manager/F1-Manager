/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.eci.arsw.f1manager.services.entities;

import org.springframework.data.annotation.Id;

/**
 *
 * @author danielagonzalez-dianasanchez
 */
public class Jugador {
    
    @Id
    private String usuario;
    private String contrasena;
    private String correo;
    private String fechaNacimiento;
    private String genero;
    private String equipo;
    private int puntos;
    private int posicion;
    private float tiempo;
    private int automovil;
    private int estrategia;
    private String idCarrera;
    private String token;

    public Jugador(String usuario, String contrasena, String correo, String fechaNacimiento, String genero, String equipo, int puntos, int posicion, float tiempo, int automovil, int estrategia, String idCarrera, String token) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.correo = correo;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.equipo = equipo;
        this.puntos = puntos;
        this.posicion = posicion;
        this.tiempo = tiempo;
        this.automovil = automovil;
        this.estrategia = estrategia;
        this.idCarrera = idCarrera;
        this.token = token;
    }

    public Jugador(){}
    
    /**
     * Obtiene el identificador de un jugador
     * @return 
     */
    public String getIdCarrera() {
        return idCarrera;
    }

    /**
     * Asignar un identificador de la carrera
     * @param idCarrera 
     */
    public void setIdCarrera(String idCarrera) {
        this.idCarrera = idCarrera;
    }

    /**
     * Obtener el usuario
     * @return 
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Asignar un usuario como jugador
     * @param usuario 
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Obtener contraseña del jugador
     * @return 
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * Asignar una contraseña al jugador
     * @param contrasena 
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    /**
     * Obtener lo puntos de una carrera del jugador
     * @return 
     */
    public int getPuntos() {
        return puntos;
    }

    /**
     * Asignar los puntos a un jugador
     * @param puntos 
     */
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    /**
     * Obtener la posicion de un jugador en la carrera
     * @return 
     */
    public int getPosicion() {
        return posicion;
    }

    /**
     * Asignar la posicion de un jugador a la carrera
     * @param posicion 
     */
    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    /**
     * Obtener el tiempo transcurrido de la carrera
     * @return 
     */
    public float getTiempo() {
        return tiempo;
    }

    /**
     * Asignar el tiempo transcurrido de la carrera
     * @param tiempo 
     */
    public void setTiempo(float tiempo) {
        this.tiempo = tiempo;
    }

    /**
     * Obtener el automovil
     * @return 
     */
    public int getAutomovil() {
        return automovil;
    }

    /**
     * Asignar un identificador al automovil del jugador
     * @param idAutomovil 
     */
    public void setAutomovil(int idAutomovil) {
        this.automovil = idAutomovil;
    }
    
    /**
     * Obtener la estrategia 
     * @return 
     */
    public int getEstrategia() {
        return estrategia;
    }

    /**
     * Asignar la estrategia
     * @param estrategia 
     */
    public void setEstrategia(int estrategia) {
        this.estrategia = estrategia;
    }

    /**
     * Obtener el equipo al que pertenesca el jugador
     * @return 
     */
    public String getEquipo() {
        return equipo;
    }

    /**
     * Asiganr el equipo escogido por el jugador
     * @param equipo 
     */
    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    /**
     * Obtener el correo del jugador 
     * @return 
     */
    public String getCorreo() { return correo; }

    /**
     * Enlazar el correo digitado por el usuario al jugador
     * @param correo 
     */
    public void setCorreo(String correo) { this.correo = correo; }

    /**
     * Obtener la fecha de nacimiento del jugador
     * @return 
     */
    public String getFechaNacimiento() { return fechaNacimiento; }

    /**
     * Asignar la fecha de nacimiento al jugador
     * @param fechaNacimiento 
     */
    public void setFechaNacimiento(String fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    /**
     * Obtener el genero del jugador
     * @return 
     */
    public String getGenero() { return genero; }

    /**
     * Asignar el genero al jugador
     * @param genero 
     */
    public void setGenero(String genero) { this.genero = genero; }

    /**
     * Obtener el token de seguidad del jugador
     * @return 
     */
    public String getToken() {
        return token;
    }

    /**
     * Asignar un token de seguridad al jugador
     * @param token 
     */
    public void setToken(String token) {
        this.token = token;
    }
}
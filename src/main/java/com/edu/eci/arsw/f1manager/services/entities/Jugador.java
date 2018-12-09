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

    public Jugador(String usuario, String contrasena, String correo, String fechaNacimiento, String genero, String equipo, int puntos, int posicion, float tiempo, int automovil, int estrategia, String idCarrera) {
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
    }
    
    public String getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(String idCarrera) {
        this.idCarrera = idCarrera;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public float getTiempo() {
        return tiempo;
    }

    public void setTiempo(float tiempo) {
        this.tiempo = tiempo;
    }

    public int getAutomovil() {
        return automovil;
    }

    public void setAutomovil(int idAutomovil) {
        this.automovil = idAutomovil;
    }
    
    public int getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(int estrategia) {
        this.estrategia = estrategia;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getCorreo() { return correo; }

    public void setCorreo(String correo) { this.correo = correo; }

    public String getFechaNacimiento() { return fechaNacimiento; }

    public void setFechaNacimiento(String fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public String getGenero() { return genero; }

    public void setGenero(String genero) { this.genero = genero; }
}
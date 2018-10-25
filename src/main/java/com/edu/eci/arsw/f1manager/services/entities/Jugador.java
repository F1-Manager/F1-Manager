/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.eci.arsw.f1manager.services.entities;

/**
 *
 * @author danielagonzalez-dianasanchez
 */
public class Jugador {
    
    private String usuario;
    private String contrasena;
    private int puntos;
    private int posicion;
    private float tiempo;
    private int idAutomovil;
    private Estrategia estrategia;
    private String idCarrera;

    public Jugador(String usuario, String contrasena, int puntos, int posicion, float tiempo, int automovil, Estrategia estrategia, String idCarrera) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.puntos = puntos;
        this.posicion = posicion;
        this.tiempo = tiempo;
        this.idAutomovil = automovil;
        this.estrategia = estrategia;
        this.idCarrera = idCarrera;
    }

    public Jugador(String usuario, String contrasena, int puntos, int posicion, float tiempo, int idAutomovil, String idCarrera) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.puntos = puntos;
        this.posicion = posicion;
        this.tiempo = tiempo;
        this.idAutomovil = idAutomovil;
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

    public int getIdAutomovil() {
        return idAutomovil;
    }

    public void setIdAutomovil(int idAutomovil) {
        this.idAutomovil = idAutomovil;
    }
    
    public Estrategia getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(Estrategia estrategia) {
        this.estrategia = estrategia;
    }
    
}

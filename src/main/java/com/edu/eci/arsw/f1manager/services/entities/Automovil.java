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
public class Automovil {
    
    private int idAutomovil;
    private String color;
    private int aceleracion;
    private int resistencia;
    private String velocidad;

    public Automovil(int idAutomovil, String color, int aceleracion, int resistencia, String velocidad) {
        this.idAutomovil = idAutomovil;
        this.color = color;
        this.aceleracion = aceleracion;
        this.resistencia = resistencia;
        this.velocidad = velocidad;
    }
    
    

    public int getIdAutomovil() {
        return idAutomovil;
    }

    public void setIdAutomovil(int idAutomovil) {
        this.idAutomovil = idAutomovil;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(int aceleracion) {
        this.aceleracion = aceleracion;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }
    
    
}

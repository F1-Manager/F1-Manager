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
public class Automovil {
    
    @Id
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
    
    
    /**
     * Obtener el identificador de un automovil
     * @return  el identificador 
     */
    public int getIdAutomovil() {
        return idAutomovil;
    }

    /**
     * Asignar un identificador de automovil dado este.
     * @param idAutomovil 
     */
    public void setIdAutomovil(int idAutomovil) {
        this.idAutomovil = idAutomovil;
    }

    /**
     * Obtener el color de un carro
     * @return 
     */
    public String getColor() {
        return color;
    }

    /**
     * Asignar el color a un carro
     * @param color 
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Obtener la aceleracion de un carro
     * @return 
     */
    public int getAceleracion() {
        return aceleracion;
    }

    /**
     * Asignar la aceleracion a un carro
     * @param aceleracion 
     */
    public void setAceleracion(int aceleracion) {
        this.aceleracion = aceleracion;
    }

    /**
     * Obtener la resistencia de un automovil
     * @return 
     */
    public int getResistencia() {
        return resistencia;
    }

    /**
     * Asignar la resistencia a un automovil
     * @param resistencia 
     */
    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    /**
     *  Obtener la velocidad de un automovil
     * @return 
     */
    public String getVelocidad() {
        return velocidad;
    }

    /**
     * Asignar la velocidad de un automovil
     * @param velocidad 
     */
    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }
    
    
}

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
public class Carrera {

    @Id
    private String identificador;
    private String clima;
    private int numeroVueltas;

    public Carrera(String identificador, String clima, int numeroVueltas) {
        this.identificador = identificador;
        this.clima = clima;
        this.numeroVueltas = numeroVueltas;
    }
    
    /**
     * Obtener el identificador de una carrera 
     * @return 
     */
    public String getIdentificador() {
        return identificador;
    }

    /**
     * Asignar un identificador a una carrera
     * @param identificador 
     */
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    /**
     * Obtener el clima de una carrera
     * @return 
     */
    public String getClima() {
        return clima;
    }

    /**
     * Asignarle un clima a la carrera
     * @param clima 
     */
    public void setClima(String clima) {
        this.clima = clima;
    }

    /**
     *  Obtener el numero de vueltas que deben realizarse en la carrera
     * @return 
     */
    public int getNumeroVueltas() {
        return numeroVueltas;
    }

    /**
     *  Asignar el numero de vultas que se haran en una carrera
     * @param numeroVueltas 
     */
    public void setNumeroVueltas(int numeroVueltas) {
        this.numeroVueltas = numeroVueltas;
    }
    
}

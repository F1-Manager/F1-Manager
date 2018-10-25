/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.eci.arsw.f1manager.services.entities;

import java.util.ArrayList;

/**
 *
 * @author danielagonzalez-dianasanchez
 */
public class Carrera {
    
    private String identificador;
    private String clima;
    private int numeroVueltas;

    public Carrera(String identificador, String clima, int numeroVueltas) {
        this.identificador = identificador;
        this.clima = clima;
        this.numeroVueltas = numeroVueltas;
    }
    
    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public int getNumeroVueltas() {
        return numeroVueltas;
    }

    public void setNumeroVueltas(int numeroVueltas) {
        this.numeroVueltas = numeroVueltas;
    }
    
}

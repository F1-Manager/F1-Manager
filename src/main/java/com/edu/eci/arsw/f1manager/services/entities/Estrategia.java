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
public class Estrategia {
    
    private int idEstrategia;
    private String llanta;
    private String aerodinamico;
    private String trasmision;
    private String estilo;

    public Estrategia(int idEstrategia, String llanta, String aerodinamico, String trasmision, String estilo) {
        this.idEstrategia = idEstrategia;
        this.llanta = llanta;
        this.aerodinamico = aerodinamico;
        this.trasmision = trasmision;
        this.estilo = estilo;
    }

    public int getIdEstrategia() {
        return idEstrategia;
    }

    public String getLlanta() {
        return llanta;
    }

    public String getAerodinamico() {
        return aerodinamico;
    }

    public String getTrasmision() {
        return trasmision;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setIdEstrategia(int idEstrategia) {
        this.idEstrategia = idEstrategia;
    }

    public void setLlanta(String llanta) {
        this.llanta = llanta;
    }

    public void setAerodinamico(String aerodinamico) {
        this.aerodinamico = aerodinamico;
    }

    public void setTrasmision(String trasmision) {
        this.trasmision = trasmision;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
}

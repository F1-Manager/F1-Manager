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
public class Estrategia {
    
    @Id
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

    /**
     * Obtener el identificador de una estrategia
     * @return 
     */
    public int getIdEstrategia() {
        return idEstrategia;
    }

    /**
     * Obtener el tipo de llanta usada
     * @return 
     */
    public String getLlanta() {
        return llanta;
    }

    /**
     * Obtener la aerodinamica seleccionada
     * @return 
     */
    public String getAerodinamico() {
        return aerodinamico;
    }

    /**
     * Obtener la transmision utilizada
     * @return 
     */
    public String getTrasmision() {
        return trasmision;
    }

    /**
     * Obtener el estilo de estrategia utilizada
     * @return 
     */
    public String getEstilo() {
        return estilo;
    }

    /**
     * Asignar un identificador a la estrategia
     * @param idEstrategia 
     */
    public void setIdEstrategia(int idEstrategia) {
        this.idEstrategia = idEstrategia;
    }

    /**
     * Asignar las llantas que se seleccionaron
     * @param llanta 
     */
    public void setLlanta(String llanta) {
        this.llanta = llanta;
    }

    /**
     *  Asignar la característica de aerodinamica
     * @param aerodinamico 
     */
    public void setAerodinamico(String aerodinamico) {
        this.aerodinamico = aerodinamico;
    }

    /**
     * Asignar la transmision
     * @param trasmision 
     */
    public void setTrasmision(String trasmision) {
        this.trasmision = trasmision;
    }

    /**
     * Asignar es estilo de la estrategia.
     * @param estilo 
     */
    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
}

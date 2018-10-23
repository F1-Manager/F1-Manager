/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.eci.arsw.f1manager.services.entities;

/**
 *
 * @author diana
 */
public class ExcepcionServiciosF1manager extends Exception{
    public ExcepcionServiciosF1manager(){
    }
    
    public ExcepcionServiciosF1manager(String message){
        super(message);
    }
    
    public ExcepcionServiciosF1manager(String message, Throwable cause){
        super(message, cause);
    }
    
    public ExcepcionServiciosF1manager(Throwable cause){
        super(cause);
    }
}

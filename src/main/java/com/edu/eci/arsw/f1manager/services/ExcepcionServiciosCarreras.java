/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.eci.arsw.f1manager.services;

/**
 *
 * @author diana
 */
public class ExcepcionServiciosCarreras extends Exception{
    public ExcepcionServiciosCarreras(){
    }
    
    public ExcepcionServiciosCarreras(String message){
        super(message);
    }
    
    public ExcepcionServiciosCarreras(String message, Throwable cause){
        super(message, cause);
    }
    
    public ExcepcionServiciosCarreras(Throwable cause){
        super(cause);
    }
}

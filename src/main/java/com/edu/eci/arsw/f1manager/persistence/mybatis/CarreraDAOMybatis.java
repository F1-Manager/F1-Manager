/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.eci.arsw.f1manager.persistence.mybatis;

import com.edu.eci.arsw.f1manager.persistence.CarreraDAO;
import org.springframework.beans.factory.annotation.Autowired;
import com.edu.eci.arsw.f1manager.persistence.mybatis.mappers.CarreraMapper;
import com.edu.eci.arsw.f1manager.services.entities.Carrera;
import org.apache.ibatis.exceptions.PersistenceException;

/**
 *
 * @author danielagonzalez-dianasanchez
 */
public class CarreraDAOMybatis implements CarreraDAO{
    
    @Autowired
    private CarreraMapper carrera;

    @Override
    public void crearCarrera(Carrera carrera) throws PersistenceException {
        try{
            this.carrera.crearCarrera(carrera.getIdentificador(), carrera.getClima(), carrera.getNumeroVueltas());
        }catch(Exception e){
            throw new PersistenceException("Error al insertar la carrera no."+carrera.getIdentificador());
        }
    }

    @Override
    public Carrera consultarCarreraPorIdentificador(String identificador) throws PersistenceException {
        Carrera carrera;
        try{
            carrera=this.carrera.consultarCarreraPorIdentificador(identificador);
        }catch(Exception e){
            throw new PersistenceException("Error al consultar la carrera no."+identificador);
        }
        return carrera;
    }
    
    
}

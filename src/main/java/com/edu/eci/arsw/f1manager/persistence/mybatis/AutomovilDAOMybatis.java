/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.eci.arsw.f1manager.persistence.mybatis;

import com.edu.eci.arsw.f1manager.persistence.AutomovilDAO;
import com.edu.eci.arsw.f1manager.persistence.mybatis.mappers.AutomovilMapper;
import com.edu.eci.arsw.f1manager.services.entities.Automovil;
import org.apache.ibatis.exceptions.PersistenceException;
import org.springframework.stereotype.Service;

/**
 *
 * @author danielagonzalez-dianasanchez
 */
@Service
public class AutomovilDAOMybatis implements AutomovilDAO{
    
    private AutomovilMapper automovil;

    @Override
    public void actualizarAutomovil(Automovil auto) throws PersistenceException {
        try{
            automovil.actualizarAutomovil(auto.getIdAutomovil(), auto.getColor(), auto.getAceleracion(), auto.getResistencia(), auto.getVelocidad());
        }catch(Exception e){
            throw new PersistenceException("Error al actualizar el automovil "+auto.getIdAutomovil());
        }
        
    }
    
    
}

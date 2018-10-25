/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.eci.arsw.f1manager.persistence.mybatis;

import com.edu.eci.arsw.f1manager.persistence.EstrategiaDAO;
import com.edu.eci.arsw.f1manager.persistence.mybatis.mappers.EstrategiaMapper;
import com.edu.eci.arsw.f1manager.services.entities.Estrategia;
import org.apache.ibatis.exceptions.PersistenceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author danielagonzalez-dianasanchez
 */
@Service
public class EstrategiaDAOMybatis implements EstrategiaDAO{
    
    @Autowired
    private EstrategiaMapper estrategia;

    @Override
    public void actualizarEstrategia(Estrategia estrategia) throws PersistenceException {
        try{
            this.estrategia.actualizarEstrategia(estrategia.getIdEstrategia(), estrategia.getLlanta(), estrategia.getAerodinamico(), estrategia.getTrasmision(), estrategia.getEstilo());
        }catch(Exception e){
            throw new PersistenceException("Error al actualizar la estrategia no."+estrategia.getIdEstrategia());
        }
    }
}

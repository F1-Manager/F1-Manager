/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.eci.arsw.f1manager.persistence;

import com.edu.eci.arsw.f1manager.services.entities.Estrategia;
import org.apache.ibatis.exceptions.PersistenceException;
import org.springframework.data.mongodb.repository.MongoRepository;
/**
 *
 * @author danielagonzalez-dianasanchez
 */
public interface EstrategiaRepository extends MongoRepository<Estrategia, Integer>{
    //public void saveEstrategia(Estrategia estrategia) throws PersistenceException;
    /**
     * Encontrar el tipo de estrategia 
     * @param idEstrategia
     * @return
     * @throws PersistenceException 
     */
    public Estrategia findByIdEstrategia(int idEstrategia) throws PersistenceException;
}

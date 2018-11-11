/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.eci.arsw.f1manager.persistence;

import com.edu.eci.arsw.f1manager.services.entities.Automovil;
import org.apache.ibatis.exceptions.PersistenceException;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author danielagonzalez-dianasanchez
 */
public interface AutomovilRepository extends MongoRepository<Automovil, Integer>{
    //public void updateAutomovil(Automovil automovil) throws PersistenceException;
}

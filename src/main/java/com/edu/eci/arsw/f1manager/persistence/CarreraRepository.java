/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.eci.arsw.f1manager.persistence;

import com.edu.eci.arsw.f1manager.services.entities.Carrera;
import org.apache.ibatis.exceptions.PersistenceException;
import org.springframework.data.mongodb.repository.MongoRepository;
/**
 *
 * @author danielagonzalez-dianasanchez
 */
public interface CarreraRepository extends MongoRepository<Carrera, String>{
    /**
     * Encontrar un usuario dado su identificador
     * @param identificador es una cadena
     * @return
     * @throws PersistenceException 
     */
    public Carrera findByIdentificador(String identificador) throws PersistenceException;
}

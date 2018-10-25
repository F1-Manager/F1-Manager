/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.eci.arsw.f1manager.persistence;

import com.edu.eci.arsw.f1manager.services.entities.Carrera;
import org.apache.ibatis.exceptions.PersistenceException;
import org.springframework.stereotype.Service;
/**
 *
 * @author danielagonzalez-dianasanchez
 */
@Service
public interface CarreraDAO {
    public void crearCarrera(Carrera carrera) throws PersistenceException;
    public Carrera consultarCarreraPorIdentificador(String identificador) throws PersistenceException;
}

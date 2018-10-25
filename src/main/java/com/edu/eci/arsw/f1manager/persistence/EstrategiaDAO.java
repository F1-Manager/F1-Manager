/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.eci.arsw.f1manager.persistence;

import com.edu.eci.arsw.f1manager.services.entities.Estrategia;
import org.apache.ibatis.exceptions.PersistenceException;
/**
 *
 * @author danielagonzalez-dianasanchez
 */
public interface EstrategiaDAO {
    public void actualizarEstrategia(Estrategia estrategia) throws PersistenceException;
}

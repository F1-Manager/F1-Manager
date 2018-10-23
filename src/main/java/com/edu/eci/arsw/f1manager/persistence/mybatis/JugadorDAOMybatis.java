/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.eci.arsw.f1manager.persistence.mybatis;

import com.edu.eci.arsw.f1manager.persistence.JugadorDAO;
import org.springframework.beans.factory.annotation.Autowired;
import com.edu.eci.arsw.f1manager.persistence.mybatis.mappers.JugadorMapper;
import com.edu.eci.arsw.f1manager.services.entities.Jugador;
import org.apache.ibatis.exceptions.PersistenceException;

/**
 *
 * @author danielagonzalez-dianasanchez
 */
public class JugadorDAOMybatis implements JugadorDAO{
    
    @Autowired
    private JugadorMapper jugador;

    @Override
    public void actualizarJugador(Jugador jugador) throws PersistenceException {
        try{
            this.jugador.actualizarJugador(jugador.getUsuario(), jugador.getPuntos(), jugador.getPosicion(), jugador.getTiempo(), jugador.getAutomovil().getIdAutomovil());
        }catch(Exception e){
            throw new PersistenceException("Error al actualizar el jugador: "+jugador.getUsuario());
        }
    }
}

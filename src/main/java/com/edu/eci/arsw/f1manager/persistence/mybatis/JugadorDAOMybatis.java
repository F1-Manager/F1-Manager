/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.eci.arsw.f1manager.persistence.mybatis;

import com.edu.eci.arsw.f1manager.persistence.JugadorDAO;
import com.edu.eci.arsw.f1manager.persistence.mybatis.mappers.JugadorMapper;
import com.edu.eci.arsw.f1manager.services.entities.Jugador;
import java.util.ArrayList;
import org.apache.ibatis.exceptions.PersistenceException;
import org.springframework.stereotype.Service;

/**
 *
 * @author danielagonzalez-dianasanchez
 */
@Service
public class JugadorDAOMybatis implements JugadorDAO{
    
    private JugadorMapper jugador;

    @Override
    public void actualizarJugador(Jugador jugador) throws PersistenceException {
        try{
            this.jugador.actualizarJugador(jugador.getUsuario(), jugador.getPuntos(), jugador.getPosicion(), jugador.getTiempo(), jugador.getIdAutomovil(),jugador.getIdCarrera());
        }catch(Exception e){
            throw new PersistenceException("Error al actualizar el jugador: "+jugador.getUsuario());
        }
    }

    @Override
    public ArrayList<Jugador> consultarJugadoresPorCarrera(String identificador) throws PersistenceException {
        ArrayList<Jugador> jugadores=new ArrayList<>();
        try{
            jugadores=jugador.consultarJugadoresPorCarrera(identificador);
        }catch(Exception e){
            throw new PersistenceException("Error al consultar los jugadores de la carrera: "+identificador);
        }
        return jugadores;
    }
}

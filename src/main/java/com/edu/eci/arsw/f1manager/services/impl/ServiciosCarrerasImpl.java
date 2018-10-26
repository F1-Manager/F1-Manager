/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.eci.arsw.f1manager.services.impl;

import com.edu.eci.arsw.f1manager.persistence.AutomovilDAO;
import com.edu.eci.arsw.f1manager.persistence.CarreraDAO;
import com.edu.eci.arsw.f1manager.persistence.EstrategiaDAO;
import com.edu.eci.arsw.f1manager.persistence.JugadorDAO;
import com.edu.eci.arsw.f1manager.services.ExcepcionServiciosCarreras;
import com.edu.eci.arsw.f1manager.services.ServiciosCarreras;
import com.edu.eci.arsw.f1manager.services.entities.Carrera;
import com.edu.eci.arsw.f1manager.services.entities.Estrategia;
import com.edu.eci.arsw.f1manager.services.entities.Jugador;
import java.util.ArrayList;
import org.apache.ibatis.exceptions.PersistenceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author diana
 */
@Service
public class ServiciosCarrerasImpl implements ServiciosCarreras{
    
    @Autowired
    private AutomovilDAO automovil;
    @Autowired
    private EstrategiaDAO estrategia;
    @Autowired
    private CarreraDAO carrera;
    @Autowired
    private JugadorDAO jugador;
    
    /**
     * Crear la carrera en la base de datos
     * @param tipo
     * @param clima
     * @param numeroVueltas 
     */
    @Override
    public void iniciarCarrera(String tipo,String clima, int numeroVueltas) throws ExcepcionServiciosCarreras{
        try{
            carrera.crearCarrera(new Carrera(tipo, clima, numeroVueltas));
        }catch(PersistenceException e){
            throw new ExcepcionServiciosCarreras(e.getMessage());
        }catch(Exception e){
            throw new ExcepcionServiciosCarreras("Error inesperado al crear la "+tipo);
        }
    }
    
    /**
     * Modificar la referencia de la carrera en el usuario
     * @param usuario
     * @param puntos
     * @param posicion
     * @param tiempo
     * @param idAutomovil
     * @param idCarrera 
     */
    @Override
    public void actualizarJugador(String usuario, int puntos, int posicion, float tiempo, int idAutomovil, String idCarrera) throws ExcepcionServiciosCarreras{
        try{
            jugador.actualizarJugador(new Jugador(usuario, idCarrera, puntos, posicion, tiempo, idAutomovil, idCarrera));
        }catch(PersistenceException e){
            throw new ExcepcionServiciosCarreras(e.getMessage());
        }catch(Exception e){
            throw new ExcepcionServiciosCarreras("Error inesperado al actualizar jugador "+usuario);
        }
    }
    
    /**
     * Modificar la estrategia
     * @param idEstrategia
     * @param estilo
     * @param llanta
     * @param aerodinamico
     * @param trasmision 
     */
    @Override
    public void actualizarEstrategia(int idEstrategia, String estilo, String llanta, String aerodinamico, String trasmision ) throws ExcepcionServiciosCarreras{
        try{
            estrategia.actualizarEstrategia(new Estrategia(idEstrategia, llanta, aerodinamico, trasmision, estilo));
        }catch(PersistenceException e){
            throw new ExcepcionServiciosCarreras(e.getMessage());
        }catch(Exception e){
            throw new ExcepcionServiciosCarreras("Error inesperado al actualizar la estrategia "+idEstrategia);
        }
    }
    
    /**
     * Obtener una lista de jugadores que participan en una carrera 
     * @param identificador
     * @return 
     */
    @Override
    public ArrayList<Jugador> consultarCarrera(String identificador) throws ExcepcionServiciosCarreras{
        ArrayList<Jugador> jugadores= new ArrayList<>();
        try{
            jugadores.add(new Jugador("Sebastian","password",712,1,5/3,3,new Estrategia(1,"Soft","Balanced","Balanced","Balanced"),"cl1"));
            jugadores.add(new Jugador("Mateo", "qwerty", 1030, 2, 6/3, 1, new Estrategia(2,"Hard","Straight","Acceleration","Press down"), "cl1"));
            jugadores.add(new Jugador("Diana","letmein",2000,3,7/3,5, new Estrategia(3, "Hard", "Balanced", "Acceleration", "Balanced"),"cl1"));
            //jugadores=jugador.consultarJugadoresPorCarrera(identificador);"
        }catch(PersistenceException e){
            throw new ExcepcionServiciosCarreras(e.getMessage());
        }catch(Exception e){
            throw new ExcepcionServiciosCarreras("Error inesperado al consultar los jugadores de la carrera "+identificador);
        }
        return jugadores;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.eci.arsw.f1manager.services.impl;

import com.edu.eci.arsw.f1manager.services.ExcepcionServiciosCarreras;
import com.edu.eci.arsw.f1manager.services.ServiciosCarreras;
import com.edu.eci.arsw.f1manager.services.entities.Carrera;
import com.edu.eci.arsw.f1manager.services.entities.Estrategia;
import com.edu.eci.arsw.f1manager.services.entities.Jugador;
import java.util.ArrayList;
import org.apache.ibatis.exceptions.PersistenceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.edu.eci.arsw.f1manager.persistence.AutomovilRepository;
import com.edu.eci.arsw.f1manager.persistence.CarreraRepository;
import com.edu.eci.arsw.f1manager.persistence.EstrategiaRepository;
import com.edu.eci.arsw.f1manager.persistence.JugadorRepository;
import org.springframework.boot.CommandLineRunner;

/**
 *
 * @author diana
 */
@Service
public class ServiciosCarrerasImpl implements ServiciosCarreras,CommandLineRunner{
    
    @Autowired
    private AutomovilRepository automovil;
    
    @Autowired
    private EstrategiaRepository estrategia;
    
    @Autowired
    private CarreraRepository carrera;
    
    @Autowired
    private JugadorRepository jugador;
    
    /**
     * Crear la carrera en la base de datos
     */
    @Override
    public void iniciarCarrera() throws ExcepcionServiciosCarreras{
        try{
            carrera.save(new Carrera("ca"+String.valueOf(carrera.findAll().size()+1), "Lluvia", 5));
        }catch(PersistenceException e){
            throw new ExcepcionServiciosCarreras(e.getMessage());
        }catch(Exception e){
            throw new ExcepcionServiciosCarreras("Error inesperado al crear la carrera");
        }
    }
    
    /**
     * Modificar la referencia de la carrera en el usuario
     * @param usuario
     * @param puntos
     * @param posicion
     * @param tiempo
     * @param automovil
     * @param idCarrera 
     */
    @Override
    public void actualizarJugador(String usuario, int puntos, int posicion, float tiempo, int automovil, int estrategia, String idCarrera, String equipo, String token) throws ExcepcionServiciosCarreras{
        try{
            jugador.save(new Jugador(usuario, jugador.findByUsuario(usuario).getContrasena(), jugador.findByUsuario(usuario).getCorreo(), jugador.findByUsuario(usuario).getFechaNacimiento(), jugador.findByUsuario(usuario).getGenero(), equipo, puntos, posicion, tiempo, automovil, estrategia, idCarrera, token));
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
    public void guardarEstrategia(int idEstrategia, String estilo, String llanta, String aerodinamico, String trasmision ) throws ExcepcionServiciosCarreras{
        try{
            estrategia.save(new Estrategia(idEstrategia, llanta, aerodinamico, trasmision, estilo));
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
            //jugadores.add(new Jugador("Sebastian","password",712,1,5/3,3,new Estrategia(1,"Soft","Balanced","Balanced","Balanced"),"cl1"));
            //jugadores.add(new Jugador("Mateo", "qwerty", 1030, 2, 6/3, 1, new Estrategia(2,"Hard","Straight","Acceleration","Press down"), "cl1"));
            //jugadores.add(new Jugador("Diana","letmein",2000,3,7/3,5, new Estrategia(3, "Hard", "Balanced", "Acceleration", "Balanced"),"cl1"));
            //jugadores=jugador.consultarJugadoresPorCarrera(identificador);"
        }catch(PersistenceException e){
            throw new ExcepcionServiciosCarreras(e.getMessage());
        }catch(Exception e){
            throw new ExcepcionServiciosCarreras("Error inesperado al consultar los jugadores de la carrera "+identificador);
        }
        return jugadores;
    }

    /**
     * Crear un jugador nuevo con los datos ingresados en la pagina de registro
     * @param usuario
     * @param contrasena
     * @param correo
     * @param fechaNacimiento
     * @param genero
     * @param puntos
     * @param posicion
     * @param tiempo
     * @param automovil
     * @param idEstrategia
     * @param idCarrera
     * @throws ExcepcionServiciosCarreras 
     */
    @Override
    public void crearJugador(String usuario, String contrasena, String correo, String fechaNacimiento, String genero, int puntos, int posicion, float tiempo, int automovil, int idEstrategia, String idCarrera) throws ExcepcionServiciosCarreras{
        if (jugador.findByUsuario(usuario) == null){
            if (contrasena.length()< 8){
                throw new ExcepcionServiciosCarreras("Your password must be at least eigth characters long");
            }
            jugador.save(new Jugador(usuario, contrasena, correo, fechaNacimiento, genero, "img/team1.jpg", puntos, posicion, tiempo, automovil, idEstrategia, idCarrera, ""));
        }else{
            throw new ExcepcionServiciosCarreras(usuario+" is not available");
        }
    }
    
    /**
     * Consultar una carrera dado un identificador
     * @param identificador
     * @return
     * @throws ExcepcionServiciosCarreras 
     */
    @Override
    public Carrera consultarCarreraPorIdentificador(String identificador) throws ExcepcionServiciosCarreras{
        return carrera.findByIdentificador(identificador);
        
    }
    
    /**
     * Obtener un jugador por medio de un usuario
     * @param usuario
     * @return
     * @throws ExcepcionServiciosCarreras 
     */
    @Override
    public Jugador consultarJugadorPorUsuario(String usuario) throws ExcepcionServiciosCarreras{
        if (jugador.findByUsuario(usuario)!=null){
            return jugador.findByUsuario(usuario);
        }
        throw new ExcepcionServiciosCarreras(usuario+" does not exist");
    }

    /**
     * Iniciar el proceso para jugar.
     * @param args
     * @throws Exception 
     */
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Connection to MongoDB");
        //crearJugador("Sebastian","password", 712, 1, 5/3, 3, 3,"cl1");
        //crearJugador("Mateo", "qwerty123", 1030, 2, 6/3, 1, 2, "cl1");
        //guardarEstrategia(3,"Soft","Balanced","Balanced","Balanced");
        //guardarEstrategia(2,"Hard","Straight","Acceleration","Press down");
        //iniciarCarrera("cl1","Lluvia", 4);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.eci.arsw.f1manager.restcontrollers;

import com.edu.eci.arsw.f1manager.services.ExcepcionServiciosCarreras;
import com.edu.eci.arsw.f1manager.services.ServiciosCarreras;
import com.edu.eci.arsw.f1manager.services.entities.Carrera;
import com.edu.eci.arsw.f1manager.services.entities.Jugador;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author danielagonzalez
 */
@RestController
@RequestMapping(value = "/races")
public class CarrerasAPIController {
    
    @Autowired
    private ServiciosCarreras servicios;
    
    @RequestMapping(method = RequestMethod.PUT, value = "{identificador}/{clima}/{numVueltas}")
    public ResponseEntity<?> crearCarrera(@PathVariable("identificador") String identificador, @PathVariable("clima") String clima, @PathVariable("numVueltas") int numVueltas){
        try {
            servicios.iniciarCarrera(identificador, clima, numVueltas);
            return new ResponseEntity<>("Race created", HttpStatus.ACCEPTED);
        } catch (ExcepcionServiciosCarreras ex) {
            Logger.getLogger(CarrerasAPIController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.FORBIDDEN);
        }
    }
    
    @RequestMapping(method = RequestMethod.GET, value ="/jugador/{id}")
    public ResponseEntity<?> obtenerJugadorPorIdentificador(@PathVariable("id") String id){
        try{
            return new ResponseEntity<>(servicios.consultarJugadorPorUsuario(id),HttpStatus.ACCEPTED);
        } catch (ExcepcionServiciosCarreras ex){
            Logger.getLogger(CarrerasAPIController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
    
    @RequestMapping(method = RequestMethod.PUT, value = "/estrategia/{idEstrategia}/{llanta}/{aerodinamico}/{transmision}/{estilo}")
    public ResponseEntity<?> crearEstrategia(@PathVariable("idEstrategia") int idEstrategia, @PathVariable("llanta") String llanta, @PathVariable("aerodinamico") String aerodinamico, @PathVariable("transmision") String transmision, @PathVariable("estilo") String estilo){
        try{
            servicios.guardarEstrategia(idEstrategia, llanta, aerodinamico, transmision, estilo);
            return new ResponseEntity<>("Estrategy created",HttpStatus.ACCEPTED);
        }catch (ExcepcionServiciosCarreras ex){
            Logger.getLogger(CarrerasAPIController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.FORBIDDEN);
        }
    }
    
    @RequestMapping(method = RequestMethod.PUT, value = "/jugador/{usuario}/{contrasena}")
    public ResponseEntity<?> crearJugador(@PathVariable("usuario") String usuario, @PathVariable("contrasena") String contrasena){
        try{
            servicios.crearJugador(usuario, contrasena, 0,0,0,0,0,"");
            return new ResponseEntity<>("Player created", HttpStatus.ACCEPTED);
        }catch (ExcepcionServiciosCarreras ex){
            Logger.getLogger(CarrerasAPIController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.FORBIDDEN);
        }
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> actualizarJugador(@RequestBody Jugador jugador){
        try{
            servicios.actualizarJugador(jugador.getUsuario(), jugador.getPuntos(), jugador.getPosicion(), jugador.getTiempo(), jugador.getAutomovil(), jugador.getEstrategia(), jugador.getIdCarrera());
            return new ResponseEntity<>("Player updated", HttpStatus.ACCEPTED);
        }catch (ExcepcionServiciosCarreras ex){
            Logger.getLogger(CarrerasAPIController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.FORBIDDEN);
        }
    }
    
    
}

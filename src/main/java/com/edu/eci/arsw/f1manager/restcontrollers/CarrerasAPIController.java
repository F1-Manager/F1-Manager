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
    
    @RequestMapping(method = RequestMethod.GET, value = "{identificador}")
    public ResponseEntity<?> obtenerJugadoresPorCarrera(@PathVariable("identificador") String identificador){
        try {
            servicios.iniciarCarrera("cl2", "Lluvia", 5);
            //ArrayList<Jugador> jugadores = servicios.consultarCarrera(identificador);
            Carrera carrera = servicios.consultarCarreraPorIdentificador(identificador);
            System.out.println("Carrera "+carrera.getIdentificador()+","+carrera.getClima()+","+carrera.getNumeroVueltas());
            return new ResponseEntity<>(carrera, HttpStatus.ACCEPTED);
        } catch (ExcepcionServiciosCarreras ex) {
            Logger.getLogger(CarrerasAPIController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
}

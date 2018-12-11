/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.eci.arsw.f1manager.restcontrollers;

import com.edu.eci.arsw.f1manager.persistence.JugadorRepository;
import com.edu.eci.arsw.f1manager.services.ExcepcionServiciosCarreras;
import com.edu.eci.arsw.f1manager.services.ServiciosCarreras;
import com.edu.eci.arsw.f1manager.services.entities.Jugador;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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
public class CarrerasAPIController extends HttpServlet {

    @Autowired
    private ServiciosCarreras servicios;

    private BCryptPasswordEncoder bCryptPasswordEncoder;
    private JugadorRepository jugadorRepository;

    public CarrerasAPIController(JugadorRepository jugadorRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
        this.jugadorRepository = jugadorRepository;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> crearCarrera(){
        try {
            servicios.iniciarCarrera();
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
    
    @RequestMapping(method = RequestMethod.POST, value = "/sign-up")
    public ResponseEntity<?> crearJugador(@RequestBody Jugador jugador ){
        try{
            servicios.crearJugador(jugador.getUsuario(), bCryptPasswordEncoder.encode(jugador.getContrasena()), jugador.getCorreo(), jugador.getFechaNacimiento(), jugador.getGenero(),0,0,0,0,0,"");
            return new ResponseEntity<>("Player created", HttpStatus.ACCEPTED);
        }catch (ExcepcionServiciosCarreras ex){
            Logger.getLogger(CarrerasAPIController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(method = RequestMethod.POST, value = "/token")
    public ResponseEntity<?> actualizarTokenJugador(@RequestBody Jugador jugador){
        try{
            servicios.actualizarJugador(jugador.getUsuario(), jugador.getPuntos(), jugador.getPosicion(), jugador.getTiempo(), jugador.getAutomovil(), jugador.getEstrategia(), jugador.getIdCarrera(), jugador.getEquipo(), jugador.getToken());
            return new ResponseEntity<>("Token updated", HttpStatus.OK);
        }catch (ExcepcionServiciosCarreras ex){
            Logger.getLogger(CarrerasAPIController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_MODIFIED);
        }
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> actualizarJugador(@RequestBody Jugador jugador){
        try{
            servicios.actualizarJugador(jugador.getUsuario(), jugador.getPuntos(), jugador.getPosicion(), jugador.getTiempo(), jugador.getAutomovil(), jugador.getEstrategia(), jugador.getIdCarrera(), jugador.getEquipo(), "");
            return new ResponseEntity<>("Player updated", HttpStatus.ACCEPTED);
        }catch (ExcepcionServiciosCarreras ex){
            Logger.getLogger(CarrerasAPIController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.FORBIDDEN);
        }
    }
    
    
}

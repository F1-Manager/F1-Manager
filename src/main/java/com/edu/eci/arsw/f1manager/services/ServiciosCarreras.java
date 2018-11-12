/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.eci.arsw.f1manager.services;

import com.edu.eci.arsw.f1manager.services.entities.Carrera;
import com.edu.eci.arsw.f1manager.services.entities.Jugador;
import java.util.ArrayList;

/**
 *
 * @author danielagonzalez
 */
public interface ServiciosCarreras {
    
    void iniciarCarrera(String tipo,String clima, int numeroVueltas) throws ExcepcionServiciosCarreras;
    void actualizarJugador(String usuario, int puntos, int posicion, float tiempo, int idAutomovil, int estrategia, String idCarrera) throws ExcepcionServiciosCarreras;
    void guardarEstrategia(int idEstrategia, String estilo, String llanta, String aerodinamico, String trasmision ) throws ExcepcionServiciosCarreras;
    ArrayList<Jugador> consultarCarrera(String identificador) throws ExcepcionServiciosCarreras;
    Carrera consultarCarreraPorIdentificador(String identificador) throws ExcepcionServiciosCarreras;
    Jugador consultarJugadorPorUsuario(String usuario) throws ExcepcionServiciosCarreras;

    public void crearJugador(String usuario, String contrasena, int puntos, int posicion, float tiempo, int automovil, int idEstrategia, String idCarrera) throws ExcepcionServiciosCarreras;
}

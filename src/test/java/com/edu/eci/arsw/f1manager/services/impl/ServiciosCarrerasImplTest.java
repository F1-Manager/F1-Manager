package com.edu.eci.arsw.f1manager.services.impl;

import com.edu.eci.arsw.f1manager.persistence.CarreraRepository;
import com.edu.eci.arsw.f1manager.persistence.EstrategiaRepository;
import com.edu.eci.arsw.f1manager.persistence.JugadorRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class ServiciosCarrerasImplTest {

    /*
    private ServiciosCarrerasImpl instance = new ServiciosCarrerasImpl();

    private CarreraRepository carreraRepository;

    @Test
    public void testIniciarCarrera() throws Exception {
        System.out.println("iniciarCarrera");
        int sizeBefore = carreraRepository.findAll().size();
        instance.iniciarCarrera();
        assertEquals(sizeBefore+1, carreraRepository.findAll().size());
    }

    /**
     * Test of actualizarJugador method, of class ServiciosCarrerasImpl.
     */
    /*
    @Test
    public void testActualizarJugador() throws Exception {
        System.out.println("actualizarJugador");
        instance.crearJugador("Prueba", "lskdkkdlas", "prueba@gmail.com", "2018-12-11", "Male", 0, 0, 0, 0, 0, "");
        assertEquals(instance.consultarJugadorPorUsuario("Prueba").getEquipo(), "img/team1.jpg");
        assertEquals(instance.consultarJugadorPorUsuario("Prueba").getToken(), "");
        instance.actualizarJugador("Prueba", 0, 0, 0, 0, 0, "", "img", "token");
        assertEquals(instance.consultarJugadorPorUsuario("Prueba").getEquipo(), "img");
        assertEquals(instance.consultarJugadorPorUsuario("Prueba").getToken(), "token");
    }*/
}
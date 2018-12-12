/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.eci.arsw.f1manager.persistence;

import com.edu.eci.arsw.f1manager.services.entities.Jugador;
import org.apache.ibatis.exceptions.PersistenceException;
import org.springframework.data.mongodb.repository.MongoRepository;
/**
 *
 * @author danielagonzalez-dianasanchez
 */
public interface JugadorRepository extends MongoRepository<Jugador, String>{
    //public void updateJugador(Jugador jugador) throws PersistenceException;
    //public ArrayList<Jugador> findByJugadoresPorCarrera(String identificador) throws PersistenceException;
    /**
     * Buscar un usuario dado su identificcacion
     * @param usuario cadena que identifica al usuario
     * @return
     * @throws PersistenceException 
     */
    public Jugador findByUsuario(String usuario) throws PersistenceException;
}

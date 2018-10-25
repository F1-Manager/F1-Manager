/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.eci.arsw.f1manager.persistence.mybatis.mappers;

import com.edu.eci.arsw.f1manager.services.entities.Jugador;
import java.util.ArrayList;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
/**
 *
 * @author danielagonzalez-dianasanchez
 */
@Service
public interface JugadorMapper {
    public ArrayList<Jugador> consultarJugadoresPorCarrera(@Param("identificador")String identificador);
    public void actualizarJugador(@Param("usuario")String usuario,@Param("puntos")int puntos,@Param("posicion")int posicion, @Param("tiempo")float tiempo, @Param("idAutomovil")int idAutomovil, @Param("idCarrera")String idCarrera);
}

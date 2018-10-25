/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.eci.arsw.f1manager.persistence.mybatis.mappers;

import com.edu.eci.arsw.f1manager.services.entities.Carrera;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author danielagonzalez-dianasanchez
 */
public interface CarreraMapper {
    public void crearCarrera(@Param("identificador") String identificador, @Param("clima") String clima, @Param("numeroVueltas") int numeroVueltas);
    public Carrera consultarCarreraPorIdentificador(@Param("identificador") String identificador);
}

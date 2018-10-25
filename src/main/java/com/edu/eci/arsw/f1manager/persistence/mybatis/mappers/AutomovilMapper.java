/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.eci.arsw.f1manager.persistence.mybatis.mappers;

import org.apache.ibatis.annotations.Param;

/**
 *
 * @author danielagonzalez-dianasanchez
 */
public interface AutomovilMapper {
    public void actualizarAutomovil(@Param("idAutomovil") int idAutomovil,@Param("color") String color, @Param("aceleracion")int aceleracion, @Param("resistencia")int resistencia, @Param("velocidad")String velocidad);
}

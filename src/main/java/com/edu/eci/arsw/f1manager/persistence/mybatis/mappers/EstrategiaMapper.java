/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.eci.arsw.f1manager.persistence.mybatis.mappers;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
/**
 *
 * @author danielagonzalez-dianasanchez
 */
@Service
public interface EstrategiaMapper {
    public void actualizarEstrategia(@Param("idEstrategia")int idEstrategia, @Param("llanta")String llanta, @Param("aerodinamico")String aerodinamico, @Param("trasmision")String trasmisiono, @Param("estilo")String estilo);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.eci.arsw.f1manager.persistence.mybatis;

import com.edu.eci.arsw.f1manager.persistence.JugadorDAO;
import org.springframework.beans.factory.annotation.Autowired;
import com.edu.eci.arsw.f1manager.persistence.mybatis.mappers.JugadorMapper;

/**
 *
 * @author danielagonzalez-dianasanchez
 */
public class JugadorDAOMybatis implements JugadorDAO{
    
    @Autowired
    private JugadorMapper jugador;
}

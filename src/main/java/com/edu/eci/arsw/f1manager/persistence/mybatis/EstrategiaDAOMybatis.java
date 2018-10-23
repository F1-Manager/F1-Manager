/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.eci.arsw.f1manager.persistence.mybatis;

import com.edu.eci.arsw.f1manager.persistence.EstrategiaDAO;
import com.edu.eci.arsw.f1manager.persistence.mybatis.mappers.EstrategiaMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author danielagonzalez-dianasanchez
 */
public class EstrategiaDAOMybatis implements EstrategiaDAO{
    
    @Autowired
    private EstrategiaMapper estrategia;
}

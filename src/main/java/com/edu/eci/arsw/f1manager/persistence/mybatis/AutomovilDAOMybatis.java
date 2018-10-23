/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.eci.arsw.f1manager.persistence.mybatis;

import com.edu.eci.arsw.f1manager.persistence.AutomovilDAO;
import com.edu.eci.arsw.f1manager.persistence.mybatis.mappers.AutomovilMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author danielagonzalez-dianasanchez
 */
public class AutomovilDAOMybatis implements AutomovilDAO{
    
    @Autowired
    private AutomovilMapper automovil;
}

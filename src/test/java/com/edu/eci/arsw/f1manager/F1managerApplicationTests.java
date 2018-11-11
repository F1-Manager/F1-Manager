package com.edu.eci.arsw.f1manager;

import com.edu.eci.arsw.f1manager.services.ExcepcionServiciosCarreras;
import com.edu.eci.arsw.f1manager.services.ServiciosCarreras;
import com.edu.eci.arsw.f1manager.services.entities.Carrera;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


public class F1managerApplicationTests{
    
    /*
    @Autowired
    private ServiciosCarreras servicios;
    
    @Test
    public void iniciarCarreraTest(){
        try {
            servicios.iniciarCarrera("cl2", "Lluvia", 5);
            Carrera carrera = servicios.consultarCarreraPorIdentificador("cl2");
            System.out.println("Carrera "+carrera.getIdentificador()+","+carrera.getClima()+","+carrera.getNumeroVueltas());
        } catch (ExcepcionServiciosCarreras ex) {
            Logger.getLogger(F1managerApplicationTests.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/

}

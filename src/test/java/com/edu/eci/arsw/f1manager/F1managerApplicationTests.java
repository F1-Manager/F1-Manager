package com.edu.eci.arsw.f1manager;

import com.edu.eci.arsw.f1manager.services.ExcepcionServiciosCarreras;
import com.edu.eci.arsw.f1manager.services.impl.ServiciosCarrerasImpl;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class F1managerApplicationTests {
    
    @Autowired
    private ServiciosCarrerasImpl servicios;
    
    @Test
    public void contextLoads() throws ExcepcionServiciosCarreras {        
        
    }
    /*
    @Test
    public void iniciarCarreraTest(){
        try {
            servicios.iniciarCarrera("cl2", "Lluvia", 5);
        } catch (ExcepcionServiciosCarreras ex) {
            Logger.getLogger(F1managerApplicationTests.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/

}

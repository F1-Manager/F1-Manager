package com.edu.eci.arsw.f1manager.restcontrollers;

import com.edu.eci.arsw.f1manager.services.entities.Jugador;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class STOMPMessagesHandler {

    @Autowired
    SimpMessagingTemplate msgt;
    
    ArrayList <Jugador> ListPlayer = new  ArrayList <>(); 
    
    @MessageMapping("/topic/newpoint.1")
    public void handlePointEvent(@DestinationVariable String player) throws Exception {
        ListPlayer.add(new Jugador(player,"123","correo","fecha","genero",123,1,0,1,2,"1"));
        System.out.println("Nuevo jugador recibido en el servidor!:" + player);
        System.out.println(ListPlayer);
        msgt.convertAndSend("/topic/newpoint.1" , ListPlayer);
    }
}

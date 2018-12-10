package com.edu.eci.arsw.f1manager.restcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class STOMPMessagesHandler {

    @Autowired
    SimpMessagingTemplate msgt;

    @MessageMapping("/topic/newpoint.{numdibujo}")
    public void handlePointEvent(@DestinationVariable String player) throws Exception {
        System.out.println("Nuevo jugador recibido en el servidor!:" + player);
        msgt.convertAndSend("/topic/newpoint." + player);
    }
}

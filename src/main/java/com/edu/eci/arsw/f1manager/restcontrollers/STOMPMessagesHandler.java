package com.edu.eci.arsw.f1manager.restcontrollers;

import com.edu.eci.arsw.f1manager.services.entities.Jugador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

@Controller
public class STOMPMessagesHandler {

    @Autowired
    SimpMessagingTemplate msgt;

    private List<Jugador> playersList = new ArrayList<>();

    @MessageMapping("/newpoint.1")
    public void handlePointEvent(String player) throws Exception {
        playersList.add(new Jugador(player, "hola", "hola@hotmail.com", "10/10/1997", "genero", 1, 2, 15.5f, 3, 2, "carrera"));
        System.out.println("Nuevo punto recibido en el servidor!: " + playersList);
        msgt.convertAndSend("/topic/newpoint.1", playersList);

    }

}

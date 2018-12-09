/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.eci.arsw.f1manager.collaboraceController;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

/**
 *
 * @author w guzman
 */
@Controller
public class StompController {
    @Autowired
    SimpMessagingTemplate msgt;
    

    @MessageMapping("newpoint.{numdibujo}")    
    public void handleRaceEvent(Point pt,@DestinationVariable String numdibujo) throws Exception {
            System.out.println("Nuevo punto recibido en el servidor!:"+pt);
            msgt.convertAndSend("/topic/newpoint."+numdibujo, pt);
}

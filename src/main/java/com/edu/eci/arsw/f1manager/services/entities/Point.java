/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.eci.arsw.f1manager.services.entities;

/**
 *
 * @author 2108263
 */
public class Point {
    
    int id;
    Float x;
    Float y;
    Float speed;

    public Float getSpeed() {
        return speed;
    }

    public void setSpeed(Float Speed) {
        this.speed = Speed;
    }
    
    public Point(){
        
    }

    public int getId() {
        return id;
    }

    public Float getX() {
        return x;
    }

    public Float getY() {
        return y;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setX(Float x) {
        this.x = x;
    }

    public void setY(Float y) {
        this.y = y;
    }
    
    
    
}

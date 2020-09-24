/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teoria.BarberoDormilon;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Faustino
 */
public class Cliente implements Runnable{
    String color;
    Sillon sillon;

    public Cliente(String color, Sillon sillon) {
        this.color = color;
        this.sillon = sillon;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Sillon getSillon() {
        return sillon;
    }

    public void setSillon(Sillon sillon) {
        this.sillon = sillon;
    }
    
    
    public void run(){
        try {
            sillon.serAtendido(color);
        } catch (InterruptedException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teoria;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Faustino
 */
public class SalidaMotos implements Runnable{
    private EstacionamientoMotos estac;

    public SalidaMotos(EstacionamientoMotos estac) {
        this.estac = estac;
    }
    
    public void run(){
         for(int i=0;i<=0;i++){
        try {
            while(estac.retirarMoto()){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(EntradaAutos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(EntradaAutos.class.getName()).log(Level.SEVERE, null, ex);
        }
            System.out.println("Espera a ver si ingresa alguien...");
            try {
                Thread.sleep(70);
            } catch (InterruptedException ex) {
                Logger.getLogger(EntradaAutos.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    }
    
}

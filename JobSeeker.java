/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1_11711357_vanguardia;

/**
 *
 * @author Claudia Cortés
 */
public class JobSeeker implements Observer{
    private String name = null;
    
    
    public JobSeeker(String name){
        this.name = name;
    }
    
    @Override
    public void update(Subject subject){
        System.out.println("El usuario  "+ this.name + " Ha sido Notificado con el empleo: "+subject);
    }
}

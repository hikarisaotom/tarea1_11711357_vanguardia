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
public abstract class Car {
    CarType model = null;
    
    //constructor 
    public Car(CarType model){
        this.model = model;
    }
    
    protected abstract void Construct();
    
    public CarType getModel(){
        return this.model;
    }
    
    public void setModel(CarType model){
        this.model = model;
    }
}

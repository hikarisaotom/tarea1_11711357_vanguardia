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
public class Meal {
    public String sandwich;
    public String sideOrder;
    public String drink;
    public String offer;
    public double price;
    
    
    //constructor
    public Meal(){
    }
    
    public String toString(){
        return sandwich +", "+sideOrder+", "
                +drink+", "+offer+", "+price;
    }
}

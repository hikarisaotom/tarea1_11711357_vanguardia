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
public class EagerSingleton {
    private static volatile EagerSingleton instance = new
    EagerSingleton();
    
    // private constructor
    private EagerSingleton() {
    }
    
    public static EagerSingleton getInstance() {
    return instance;
    }
    
    
    
    public String toString(){
        return "Singleton";
    }

}

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
public class MealDirector {
    public MealDirector(){
    }
    
    public void makeMeal(MealBuilder mealBuilder){
        mealBuilder.addSandwich("Empamada");
        mealBuilder.addDrink("Coca-Cola");
        mealBuilder.addOffer("N/A");
        mealBuilder.setPrice(100);
        mealBuilder.addSide("Papitas");
        
        
        System.out.println(mealBuilder.getModel().toString());
        
    }
}

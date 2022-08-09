/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menuObjectsDecorator;

/**
 *
 * @author Irian
 */
public class Beer extends drinkDecorator {
    
 public Beer (Order drink){
    this.drink = drink;
    }
    
    @Override
    public String getDescription(){
    return drink.getDescription() + " , Beer";
    }
    
    @Override
    public double cost() {
        return drink.cost() + 8.00;
    }  
}

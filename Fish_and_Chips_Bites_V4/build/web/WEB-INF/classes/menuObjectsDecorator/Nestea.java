/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menuObjectsDecorator;

/**
 *
 * @author Irian
 */
public class Nestea extends drinkDecorator {
    
    public Nestea (Order drink){
    this.drink = drink;
    }
    
    @Override
    public String getDescription(){
    return drink.getDescription() + " , Nestea";
    }
    
    @Override
    public double cost() {
        return drink.cost() + 4.00;
    }  
    
}

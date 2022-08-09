/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menuObjectsDecorator;

/**
 *
 * @author Irian
 */
public class Spicy extends extrasDecorator {
    
    public Spicy (Order extra){
    this.extra = extra;
    }
    
    @Override
    public String getDescription(){
    return extra.getDescription() + " , Spicy Sauce";
    }
    
    @Override
    public double cost() {
        return extra.cost() + 2.00;
    }
    
    
}

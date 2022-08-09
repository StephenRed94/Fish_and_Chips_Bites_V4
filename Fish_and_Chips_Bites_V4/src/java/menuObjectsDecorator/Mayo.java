/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menuObjectsDecorator;

/**
 *
 * @author Irian
 */
public class Mayo extends extrasDecorator{
    
    public Mayo (Order extra){
    this.extra = extra;
    }
    
    @Override
    public String getDescription(){
    return extra.getDescription() + " , Mayonnaise";
    }
    
    @Override
    public double cost() {
        return extra.cost() + 2.00;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menuObjectsDecorator;

/**
 *
 * @author Irian
 */
public abstract class extrasDecorator implements Order{
    
    Order extra;
    
    @Override
    public abstract String getDescription();
    @Override
    public abstract double cost();
    
}

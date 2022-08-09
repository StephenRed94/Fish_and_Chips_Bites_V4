/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menuObjectsDecorator;

/**
 *
 * @author Irian
 */
public class Tilapia implements Order {
    
    @Override 
    public String getDescription(){
    return "Tilapia";
    }
    @Override 
    public double cost(){
    return 15.00;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menuObjectsDecorator;

/**
 *
 * @author Irian
 */
public class PinkSalmon implements Order {
    
    @Override
    public String getDescription(){
    return "Pink Salmon";
    }
    
    @Override
    public double cost(){
    return 20.00;
    }
    
    
    
}

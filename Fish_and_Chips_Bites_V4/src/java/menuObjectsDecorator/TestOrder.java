/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menuObjectsDecorator;

/**
 *
 * @author Irian
 */
public class TestOrder {
    
    public static void main(String arg[]){
    
        Order order = new Tilapia();
        
        // Order a Tilapia, with no Extras and no Drinks
        System.out.println(order.getDescription() + " $" + order.cost());
        
       // Order a Pink Salmon with Ketchup and Beer
        Order order2 = new PinkSalmon();
        order2 = new Ketchup(order2); //Wrap it with Ketchup
        order2 = new Beer(order2);    // Add a Beer to your order
        System.out.println(order2.getDescription() + " $" + order2.cost());
        
        //Order a Bass with Mayonnaise and Mustard and a Lemonade
        Order order3 = new Bass();
        order3 = new Bass();
        order3 = new Mayo(order3); //Wrap it with Mayonnaise
        order3 = new Mustard(order3); // Wrap it with Mustard
        order3 = new Lemonade(order3); // Wrap it with Lemonade or add Lemonade
        System.out.println(order3.getDescription() + " $" + order3.cost());
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt2.view;

import byui.cit260.josephInEgypt2.control.InventoryControl;
import byui.cit260.josephInEgypt2.model.Cart;
import java.util.Scanner;

/**
 *
 * @author Matt
 * @author Britt
 */
public class CollectMenuView extends View {
    
    public CollectMenuView() {
        super("\n" 
            +"\n----------------------------------------------"
            + "\n| Inventory Cart Space                         "
            + "\n----------------------------------------------"
            + "\nS - Cart space available"
            + "\nE - Exit"
            + "\n----------------------------------------------");    
    }
    @Override
    public boolean doAction(Object obj) {
        
        String value = (String)obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        switch (choice) {
            case 'S':
                this.spaceAvailable();
                break;
            case 'E': // exit menu
                return false;
            default:
                System.out.println("\n** Invalid selection ** Try again");
                break;      
        }
        return true;
    }
    
    private void spaceAvailable() {
        
        double noUnits = 0;  //get from inventory
        double cartSpace = 0;  //unknown?
        double remainingSpaces = this.calcSpaces(noUnits, cartSpace);
        //display message
        if (remainingSpaces >= 0 ){
            System.out.println("You have " + remainingSpaces +" spaces left. ");
            return;
        }
        else 
            System.out.println("You do not have any spaces left.");
        return;
        
    }
    
    private double calcSpaces(double noUnits, double cartSpace) {
	if (noUnits <1){
	return -1;
        }
        if (cartSpace <1){
        return -1;
        }
        double spaceNeeded= noUnits/ 2;
	double remainingSpaces=cartSpace- spaceNeeded;
	return remainingSpaces;
        }
}











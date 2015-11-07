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
public class CollectMenuView {
    
    //create menu for view
    private final String MENU = "\n" 
            +"\n----------------------------------------------"
            + "\n| Inventory Cart Space                         "
            + "\n----------------------------------------------"
            + "\nS - Cart space available"
            + "\nE - Exit"
            + "\n----------------------------------------------";    
    
    void displayCollectMenu() {
        char selection = ' ';
        
        do{
         System.out.println(MENU); // display the menu
         
         String input = this.getInput(); // GET the user’s selection
         selection = input.charAt(0); // get first character of string
         
         this.doAction(selection); // do action based on selection
         
     } while (selection != 'E'); // a selection is not ""
    }
       //get menu choice from user
    private String getInput() {
        boolean valid = false; // indicates if the input has been received
        String userInput = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        
        while(!valid) { //while a valid entry has not been retrieved
            //prompt for the choice
            System.out.println("Enter choice");
            
            //get the input from the keyboard and trimm of the blanks
            userInput= keyboard.nextLine();
            userInput = userInput.trim();
            
            //if the input is invalid (greater than two characters in length)
            if (userInput.length() > 2){
                System.out.println("Invalid selection");
                continue; //  and repeat again
            }
            break; //out of the repitition
            
        }
        return userInput; // return the name
    }
    
    //do the action from the choice
    private void doAction(char choice) {
        
        switch (choice) {
            case 'S':
                this.spaceAvailable();
                break;
            case 'E': // exit menu
                return;
            default:
                System.out.println("\n** Invalid selection ** Try again");
                break;      
        }
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











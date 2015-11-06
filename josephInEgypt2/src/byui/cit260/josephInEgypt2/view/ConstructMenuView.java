/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt2.view;

import byui.cit260.josephInEgypt2.control.ManufactureControl;
import byui.cit260.josephInEgypt2.model.Location;
import java.util.Scanner;

/**
 *
 * @author Britt
 */
public class ConstructMenuView {
    
    //create menu for view
    private final String MENU = "\n" 
            +"\n----------------------------------------------"
            + "\n| Contruct Barrels                                  |"
            + "\n----------------------------------------------"
            + "\n How many barrels would"
            + "\nyou like to construct?"
            + "\nN - To enter number of barrels"
            + "\nE - Exit"
            + "\n----------------------------------------------";
    
    
    void displayConstructMenu() {
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
            case 'N': // enter number
                this.barrelNumber();
                break;
            case 'E': // exit menu
                return;
            default:
                System.out.println("\n** Invalid selection ** Try again");
                break;      
        }
    }
    //action called when N is selected
    private void barrelNumber() {
        
        
        double woodAvailable = 10; //later will have to get this from inventory
        //get brrels desired from user
        double noBarrels = this.getBarrelNumber();
        //use manufactureControl to calculate if barrels can be built
        double remainingWood = this.calcBarrels(woodAvailable, noBarrels);
        //display message
        if (remainingWood >= 0 ){
            System.out.println("You can build " + noBarrels +" barrels. "
                    + "Barrels built.");
            //remove wood from inventory and add barrels to inventory
            return;}
        else 
            System.out.println("You do not have enough wood."
                + "Barrels not built");
        return;
                    
        
    }    
    //get the barrel number from the user
    private double getBarrelNumber(){    
        boolean valid = false;
        double enteredValue = 0;
        
                
        Scanner keyboard = new Scanner(System.in);
        while (!valid) {
            System.out.println("Enter number of barrels. 1 - 10");
            enteredValue = keyboard.nextDouble();
            
            if (enteredValue < 1 || enteredValue > 10 ){
            System.out.println ("Number must be between 1 and 10");
            continue;
            }
            break;
            }
        return enteredValue;
        }
        //call manufactureControl to perform calculations
    private double calcBarrels(double woodAvailable, double noBarrels) {
        double woodStored= woodAvailable;
        double desiredBarrels= noBarrels;
        ManufactureControl manufactureControl = new ManufactureControl();
        double remainingWood = manufactureControl.calcBuild(woodStored, desiredBarrels);
        return remainingWood;
        
    }
    }










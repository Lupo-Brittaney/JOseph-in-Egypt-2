/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt2.view;

import byui.cit260.josephInEgypt2.control.HarvestControl;
import byui.cit260.josephInEgypt2.control.ManufactureControl;
import byui.cit260.josephInEgypt2.model.Location;
import java.util.Scanner;

/**
 *
 * @author Britt
 */
public class HarvestMenuView {
    
    //create menu for view
    private final String MENU = "\n" 
            +"\n----------------------------------------------"
            + "\n| Harvest Resources                            |"
            + "\n----------------------------------------------"
            + "\n How many resources would"
            + "\nyou like to harvest?"
            + "\nN - To enter number of resources"
            + "\nE - Exit"
            + "\n----------------------------------------------";
    
    
    void displayHarvestMenu() {
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
                this.resourceNumber();
                break;
            case 'E': // exit menu
                return;
            default:
                System.out.println("\n** Invalid selection ** Try again");
                break;      
        }
    }
    //action called when N is selected
    private void resourceNumber() {
        
        
        //get brrels desired from user
        double noUnits = this.getUnitsNumber();
        double noBarrels = 10;  //get later?
        double unitsAvailable = 6;  //get later?
        //use manufactureControl to calculate if barrels can be built
        double remainingBarrels = this.calcHarvest(noUnits, noBarrels, unitsAvailable);

        //display message
        if (remainingBarrels >= 1 ){
            System.out.println("You can harvest " + noUnits +" resources. "
                    + "Barrels filled.");
            //remove resources from the origin and into barrel
            return;}
        else 
            System.out.println("You do not have enough barrels."
                + "Resources not harvested");
        return;
                    
        
    }    
    //get the barrel number from the user
    private double getUnitsNumber(){    
        boolean valid = false;
        double enteredValue = 0;
        
                
        Scanner keyboard = new Scanner(System.in);
        while (!valid) {
            System.out.println("Enter number of resources. 1 - 10");
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
    private double calcHarvest(double noUnits, double noBarrels, double unitsAvailable) {
        double emptyBarrels= noBarrels;
        double unitsDesired= noUnits;
        double resourceAvailable= unitsAvailable;
        HarvestControl harvestControl = new HarvestControl();
        double remainingBarrels = harvestControl.harvestResource(unitsDesired, emptyBarrels, resourceAvailable);
        return remainingBarrels;
        
    }
    }











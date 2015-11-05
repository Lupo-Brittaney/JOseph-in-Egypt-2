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
    
   /* public ConstructMenuView(){
        
    }
    public void constructMenu(){
    // Display the banner screen
    this.displayBanner();
    //Get the players name
    String noBarrels = this.getNoBarrels();
    //call manufacture function to calculate
    ;
    //DISPLAY barrels created
    this.displayBarrelsCreated();
    //DISPLAY the main menu  
    MainMenuView mainMenu = new MainMenuView();
    mainMenu.displayMenu();
    }*/
    
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

    private String getInput() {
        boolean valid = false; // indicates if the name has been received
        String userInput = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        
        while(!valid) { //while a valid entry has not been retrieved
            //prompt for the choice
            System.out.println("Enter choice");
            
            //get the name from the keyboard and trimm of the blanks
            userInput= keyboard.nextLine();
            userInput = userInput.trim();
            
            //if the name is invalis (greater than two characters in length)
            if (userInput.length() > 2){
                System.out.println("Invalid selection");
                continue; //  and repeat again
            }
            break; //out of the repitition
            
        }
        return userInput; // return the name
    }

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

    private void barrelNumber() {
        
        
        double woodAvailable = 10; //later will have to get this from inventory
        double noBarrels = this.getBarrelNumber();
        double remainingWood = this.calcBarrels(woodAvailable, noBarrels);
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

    private double calcBarrels(double woodAvailable, double noBarrels) {
        double woodStored= woodAvailable;
        double desiredBarrels= noBarrels;
        ManufactureControl manufactureControl = new ManufactureControl();
        double remainingWood = manufactureControl.calcBuild(woodStored, desiredBarrels);
        return remainingWood;
        
    }
    }









/*
   private int getNoBarrels() {
        boolean valid = false; // indicates if the name has been received
        String noBarrels = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        
        while(!valid) { //while a valid name has not been retrieved
            //prompt for the player's name
            System.out.println("Enter the number of barrels below");
            
            //get the name from the keyboard and trimm of the blanks
            noBarrels= keyboard.nextLine();
            noBarrels = noBarrels.trim();
            
            //if the name is invalid (less than two characters in length)
            if (noBarrels.length() < 2){
                System.out.println("Invalid number");
                continue; //  and repeat again
            }
            break; //out of the repitition
            
        }
        int desiredBarrels = Integer.parseInt(noBarrels);
        return desiredBarrels; // return the number
    
    
    }
   //create test location for equation
   Location testLocation = new Location();
   //assign values to testLocation
   testLocation.woodAvailable = 10;
   
   
   */
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt2.view;

import java.util.Scanner;

/**
 *
 * @author Matt PC
 */
public class GameMenuView {
       private final String MENU = "\n"
            + "\n----------------------------------------------"
            + "\n| Game Menu                                  |"
            + "\n----------------------------------------------"
            + "\nM - Move to new location"
            + "\nB - Construct barrels"
            + "\nH - Harvest resoures"
            + "\nC - collect wood"
            + "\nL - Load barrels"
            + "\nU - Unload barrels"
            + "\n V - Display View Menu"
            + "\nQ - Quit"
            + "\n----------------------------------------------";

    void displayMenu() {
        char selection = ' ';
     do{
         System.out.println(MENU); // display the main menu
         
         String input = this.getInput(); // GET the user’s selection
         selection = input.charAt(0); // get first character of string
         
         this.doAction(selection); // do action based on selection
         
     } while (selection != 'Q'); // a selection is not "Quit"
    }

    private String getInput() {
         boolean valid = false; // indicates if the selection has been received
        String userInput = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        
        while(!valid) { //while a valid selection has not been retrieved
            //prompt for the menu choice
            System.out.println("Enter menu choice");
            
            //get the name from the keyboard and trimm of the blanks
            userInput= keyboard.nextLine();
            userInput = userInput.trim();
            
            //if the selection is invalid (more than one character in length)
            if (userInput.length() > 1){
                System.out.println("Invalid selection");
                continue; //  and repeat again
            }
            break; //out of the repitition
            
        }
        return userInput; // return the name
    }

    private void doAction(char choice) {
        
        switch (choice) {
            case 'M': // move player
                this.displayMoveMenu();
                break;
            case 'B': // construct barells
                this.displayContstructMenu();
                break;
            case 'H': // harvest
                this.displayHarvestMenu();
                break;
            case 'C': // collect wood
                this.displayCollectMenu();
                break;
            case 'L' : //load barrels to cart
                this.displayLoadMenu();
                break;
            case 'U' : //unload barrels from cart
                this.displayUnloadMenu();
                break;
            case 'V' : //display view menu
                this.displayViewMenu();
                break;
            case 'Q': // quit menu
                return;
            default:
                System.out.println("\n** Invalid selection ** Try again");
                break;      
        }
    }

    private void displayMoveMenu() {
        // display the move screen
        MoveMenuView moveMenu = new MoveMenuView();
        moveMenu.displayMoveMenu();
    }

    private void displayContstructMenu() {
        // display the construct barrel view
        ConstructMenuView constructMenu = new ConstructMenuView();
        constructMenu.displayConstructMenu();
    }

    private void displayHarvestMenu() {
        // display the harvest resource menu
        HarvestMenuView harvestMenu = new HarvestMenuView();
        harvestMenu.displayHarvestMenu();
    }

    private void displayCollectMenu() {
       // display the collect menu
        CollectMenuView collectMenu = new CollectMenuView();
        collectMenu.displayCollectMenu();
    }

    private void displayLoadMenu() {
        // display the load menu to load barrels
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenu();
    }

    private void displayUnloadMenu() {
        // display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenu();
    }

    private void displayViewMenu() {
        // display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenu();
    }


    
}

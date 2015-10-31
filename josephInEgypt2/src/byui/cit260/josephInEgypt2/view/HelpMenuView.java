/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt2.view;

import byui.cit260.josephInEgypt2.control.GameControl;
import java.util.Scanner;
import josephinegypt2.JosephInEgypt2;

/**
 *
 * @author Matt PC
 */
public class HelpMenuView {
    
    private final String MENU = "\n"
            + "\n----------------------------------------------"
            + "\n| Help Menu                                  |"
            + "\n----------------------------------------------"
            + "\nO - Game objectives"
            + "\nM - How to move"
            + "\nH - How to harvest"
            + "\nD - How to collect wood"
            + "\nQ - Quit"
            + "\n----------------------------------------------";
    void displayHelpMenu() {
     char selection = ' ';
     do{
         System.out.println(MENU); // display the main menu
         
         String input = this.getInput(); // GET the user’s selection
         selection = input.charAt(0); // get first character of string
         
         this.doAction(selection); // do action based on selection
         
     } while (selection != 'Q'); // a selection is not "Quit"
        
        
    }

    private String getInput() {
        boolean valid = false; // indicates if the name has been received
        String userInput = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        
        while(!valid) { //while a valid name has not been retrieved
            //prompt for the player's name
            System.out.println("Enter menu choice");
            
            //get the name from the keyboard and trimm of the blanks
            userInput= keyboard.nextLine();
            userInput = userInput.trim();
            
            //if the name is invalis (less than two characters in length)
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
            case 'O': // game objectives
                this.gameObjective();
                break;
            case 'M': // how to move
                this.howToMove();
                break;
            case 'H': // how to harvest
                this.howToHarvest();
                break;
            case 'D': // how to collect
                this.howToCollect();
                break;
            case 'Q': // quit menu
                return;
            default:
                System.out.println("\n** Invalid selection ** Try again");
                break;      
        }
    }

    private void gameObjective() {
        System.out.println("\nGame objective is to store 10 barrels of legumes,"
                + "\n10 barrels of grain and 4 barrels of honey"
                + "\nwithin the 20 turns allowed.");
    }

    private void howToMove() {
        System.out.println("\nEnter coordinates on the map");
    }

    private void howToHarvest() {
        System.out.println("\nWhen you go to the location that has"
                + "\nharvestable resources you must select"
                + "\nhow much you want to harvest but you can only"
                + "\nharvest your chosen amount if you have enough"
                + "\nempty barrels on the cart.  Each empty barrel"
                + "\ncan hold 2 units of harvested resource.");
    }

    private void howToCollect() {
                System.out.println("\nWhen you go to the location that has"
                + "\navailable wood you must select"
                + "\nhow much you want to collect but you can only"
                + "\ncollect your chosen amount if you have enough"
                + "\nempty spaces on the cart.  Each empty space"
                + "\ncan hold 2 units of collected wood.");
    }
    
}

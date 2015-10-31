/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt2.view;

import byui.cit260.josephInEgypt2.control.GameControl;
import static java.time.Clock.system;
import java.util.Scanner;
import josephinegypt2.JosephInEgypt2;

/**
 *
 * @author Britt
 */
public class MainMenuView {
    
    private final String MENU = "\n"
            + "\n----------------------------------------------"
            + "\n| Main Menu                                  |"
            + "\n----------------------------------------------"
            + "\nG - Start game"
            + "\nH - Get help on how to play the game"
            + "\nS - Save game"
            + "\nE - Exit"
            + "\n----------------------------------------------";
    
    void displayMenu() {
     char selection = ' ';
     do{
         System.out.println(MENU); // display the main menu
         
         String input = this.getInput(); // GET the user’s selection
         selection = input.charAt(0); // get first character of string
         
         this.doAction(selection); // do action based on selection
         
     } while (selection != 'E'); // a selection is not "Exit"
        
        
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
            case 'N': // create and start a new game
                this.startNewGame();
                break;
            case 'G': // get and start an existing game
                this.startExistingGame();
                break;
            case 'H': // help menu
                this.displayHelpMenu();
                break;
            case 'S': // save current game
                this.saveGame();
                break;
            case 'E': // Exit game
                return;
            default:
                System.out.println("\n** Invalid selection ** Try again");
                break;      
        }
    }

    private void startNewGame() {
        GameControl.createNewGame(JosephInEgypt2.getPlayer()); // create new game
        
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
        
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }

    private void displayHelpMenu() {
        
        // display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenu();
    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }
    
}
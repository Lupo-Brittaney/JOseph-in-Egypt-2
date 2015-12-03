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
public class MainMenuView extends View {
    
    public MainMenuView() {
        super("\n"
            + "\n----------------------------------------------"
            + "\n| Main Menu                                  |"
            + "\n----------------------------------------------"
            + "\nN - Start new game"
            + "\nG - Start existing game"
            + "\nH - Get help on how to play the game"
            + "\nS - Save game"
            + "\nE - Exit"
            + "\n----------------------------------------------");
    }
    
    @Override
    public boolean doAction(Object obj) {
        
        String value = (String)obj;
        
        value = value.toUpperCase();
        char choice = value.charAt(0);
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
                return true;
            default:
                ErrorView.display(this.getClass().getName(),"** Invalid selection ** Try again");
                break;      
        }
        return false;
    }

    private void startNewGame() {
        GameControl.createNewGame(JosephInEgypt2.getPlayer()); // create new game
        
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
        
    }

    private void startExistingGame() {
        //prompt for and get the name of the file to save the game in
        System.out.println("\n\nEnter the file path for the file where the game"
                + "is to be saved");
        
        String filePath = this.getInput();
        
        try{
            //start saved game
            GameControl.getSavedGame(filePath);
        }catch (Exception ex){
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        //display the game menu
        GameMenuView gameMenu= new GameMenuView();
        gameMenu.display();
    }

    private void displayHelpMenu() {
        
        // display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveGame() {
        //prompt for anf get the name of the file to save the game in
        System.out.println("\n\nEnter the file path for the file where the game"
                + "is to be saved.");
        String filePath = this.getInput();
        
        try{
            //save the game to the specified file
            GameControl.saveGame(JosephInEgypt2.getCurrentGame(), filePath);
        }catch(Exception ex){
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
    }
    
}
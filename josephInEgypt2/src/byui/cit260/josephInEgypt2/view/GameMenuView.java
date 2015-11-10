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
public class GameMenuView extends View {
    
    public GameMenuView() {
       super("\n"
            + "\n----------------------------------------------"
            + "\n| Game Menu                                  |"
            + "\n----------------------------------------------"
            + "\nM - Move to new location"
            + "\nB - Construct barrels"
            + "\nH - Harvest resoures"
            + "\nC - collect wood"
            + "\nL - Load barrels"
            + "\nU - Unload barrels"
            + "\nV - Display View Menu"
            + "\nQ - Quit"
            + "\n----------------------------------------------");
}
    public boolean doAction(Object obj) {
        
        String value = (String)obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
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
                return false;
            default:
                System.out.println("\n** Invalid selection ** Try again");
                break;      
        }
        return true;
    }

    private void displayMoveMenu() {
        // display the move screen
        MoveMenuView moveMenu = new MoveMenuView();
        moveMenu.displayMoveMenu();
    }

    private void displayContstructMenu() {
        // display the construct barrel view
        ConstructMenuView constructMenu = new ConstructMenuView();
        constructMenu.display();
    }

    private void displayHarvestMenu() {
        // display the harvest resource menu
        HarvestMenuView harvestMenu = new HarvestMenuView();
        harvestMenu.display();
    }

    private void displayCollectMenu() {
       // display the collect menu
        CollectMenuView collectMenu = new CollectMenuView();
        collectMenu.display();
    }

    private void displayLoadMenu() {
        // display the load menu to load barrels
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void displayUnloadMenu() {
        // display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void displayViewMenu() {
        // display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }


    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt2.view;

import byui.cit260.josephInEgypt2.control.GameControl;
import byui.cit260.josephInEgypt2.model.Location;
import byui.cit260.josephInEgypt2.model.ResourceItem;
import byui.cit260.josephInEgypt2.model.Scene;
import java.awt.Point;
import java.util.Scanner;
import josephinegypt2.JosephInEgypt2;

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
            + "\nW - Collect wood"
            + "\nL - Load barrels"
            + "\nU - Unload barrels"
            + "\nV - View Map"
            + "\n I - View items stored"
            + "\n C - View cart contents"
            + "\n T - Vuew turn counter"
            + "\nQ - Quit"
            + "\n----------------------------------------------");
}
    @Override
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
            case 'W': // collect wood
                this.displayCollectMenu();
                break;
            case 'L' : //load barrels to cart
                this.displayLoadMenu();
                break;
            case 'U' : //unload barrels from cart
                this.displayUnloadMenu();
                break;
            case 'V' : //display map
                this.displayMap();
                break;
            case 'I'://view items stored
                this.displayItemsStored();
                break;
            case 'C'://view cart contents
                this.displayCartContents();
                break;
            case 'T'://diaplay turn counter
                this.displayTurnCounter();
                break;
            case 'Q': // quit menu
                return true;
            default:
                System.out.println("\n** Invalid selection ** Try again");
                break;      
        }
        return false;
    }

    private void displayMoveMenu() {
        // display the move screen
        MoveMenuView moveMenu = new MoveMenuView();
        moveMenu.display();
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
        LoadMenuView loadMenu = new LoadMenuView();
        loadMenu.display();
    }

    private void displayUnloadMenu() {
        // display the help menu
        UnloadMenuView unloadMenu = new UnloadMenuView();
        unloadMenu.display();
    }

    public void displayMap() {
        Location[][] locations = JosephInEgypt2.getCurrentGame().getMap().getLocations();
        //Title display
        System.out.println("\n |******Joseph's Map of Egypt******|");

        //Row and column display
        System.out.println("\n |  0  |  1  |  2  |  3  |  4  |");
        for (int i = 0; i < locations.length; i++) {

            System.out.println("--------------------------------");

            String grid = i + "|";
            for (int j = 0; j < locations[i].length; j++) {
                Location location = locations[i][j];

                String symbol;
               

                
                        
                        
               if(location.getVisited() == true) {

                    Scene scene = location.getScene();
                    symbol = scene.getSymbol();
                } else {
                    symbol = " ? ";
                }
                grid += (" " + symbol + " |");
            
            }
            System.out.println(grid);
        }

    }

    private void displayItemsStored() {
        //get the sorted list of inventory items for the current game
        ResourceItem[] resource = GameControl.getSortedResourceList();

        System.out.println("\n List of Stored Itesm");
        System.out.println("Decsription" + "\t"
                + "Required" + "\t"
                + "In Stock");

        //for each inventory item
        for (ResourceItem resourceItem : resource) {
            //display the description, the required amount and amount in stock
            System.out.println(resourceItem.getDescription() + "\t"
                    + resourceItem.getRequiredAmount() + "\t"
                    + resourceItem.getQuantityInStock());
        }

    }

    private void displayCartContents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayTurnCounter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

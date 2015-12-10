/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt2.view;

import byui.cit260.josephInEgypt2.control.MapControl;
import byui.cit260.josephInEgypt2.model.Actor;
import byui.cit260.josephInEgypt2.model.Location;
import byui.cit260.josephInEgypt2.model.MoveCounter;
import java.awt.Point;
import java.util.Scanner;
import josephinegypt2.JosephInEgypt2;

/**
 *
 * @author Britt
 */
public class MoveMenuView extends View{

    public MoveMenuView() {
                super("\n"
            + "\n----------------------------------------------"
            + "\n| Move Menu                                  |"
            + "\n----------------------------------------------"
            + "\nM - View Map"
            + "\nC - Enter coordinates of desired location"
            + "\nE - Exit"
            + "\n----------------------------------------------");
        
    }

    @Override
    public boolean doAction(Object obj) {
        String value = (String)obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        switch (choice) {
            case 'M': // view map
                this.viewMap();
                break;
            case 'C': //enter coordinates
                this.enterCoord();
            case 'E': // exit menu
                return true;
            default:
                ErrorView.display(this.getClass().getName(),"** Invalid selection ** Try again");
                break;      
        }
        return false;
    }

    private void viewMap() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMap();
        
    }

    private void enterCoord() {
        
        int y1 = 0;
        int x1 = 0;
        
        // Getting all of the coordinates
        this.console.println("Enter the X coordinate of the first point: ");
        String valueX = this.getInput();
        this.console.println("Enter the Y coordinate of the first point: ");
        String valueY = this.getInput();
        try {
            x1 = Integer.parseInt(valueX);
            y1 = Integer.parseInt(valueY);
        } catch (NumberFormatException nf) {
            ErrorView.display(this.getClass().getName(), "error reading input:"
                    + nf.getMessage());
        }
        if (x1 < 0 || x1 > JosephInEgypt2.getCurrentGame().getMap().getNoOfRows()) {
            System.out.println("Invalid coordinate entered");
            return;
        }//  and repeat again

        if (y1 < 0 || y1 > JosephInEgypt2.getCurrentGame().getMap().getNoOfColumns()) {
            System.out.println("Invalid coordinate entered");
            return;
        }
        
        
       
    Location[][] locations = JosephInEgypt2.getCurrentGame().getMap().getLocations();
    Location currentLocation = locations[x1][y1];
    locations[x1][y1].setVisited(true);
    JosephInEgypt2.getCurrentGame().getActor().setCoordinates(x1, y1);
    String description = currentLocation.getScene().getDescription();
    
    //get counter, current count
    int count= JosephInEgypt2.getCurrentGame().getMoveCounter().getCounter();
    //decrement counter
    int newCount= count--;
    //set count with new decremented count
    JosephInEgypt2.getCurrentGame().getMoveCounter().setCounter(newCount);
    
    
    this.console.println(description + "\n You have " + newCount + "of 20 moves left.");   
   
    
    
    }
}

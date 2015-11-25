/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt2.view;

import byui.cit260.josephInEgypt2.control.MapControl;
import byui.cit260.josephInEgypt2.model.Actor;
import byui.cit260.josephInEgypt2.model.Location;
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
                System.out.println("\n** Invalid selection ** Try again");
                break;      
        }
        return false;
    }

    private void viewMap() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMap();
        
    }

    private void enterCoord() {
        Scanner input = new Scanner(System.in);

   // Getting all of the coordinates
   System.out.print("Enter the X coordinate of the first point: ");
   int x1 = (int) input.nextDouble();
   if (x1 <0 || x1 > JosephInEgypt2.getCurrentGame().getMap().getNoOfRows()){
       System.out.println("Invalid coordinate entered");
       return;
        }//  and repeat again
   System.out.print("Enter the Y coordinate of the first point: ");
   int y1 = (int) input.nextDouble();
        if (y1 <0 || y1> JosephInEgypt2.getCurrentGame().getMap().getNoOfColumns()){
            System.out.println("Invalid coordinate entered");
        return;
        }    
 
    
           
    Location[][] locations = JosephInEgypt2.getCurrentGame().getMap().getLocations();
    Location currentLocation = locations[x1][y1];
    locations[x1][y1].setVisited(true);
    //Actor.setCoordinates(x1, y1);
                
    String description = currentLocation.getScene().getDescription();
    System.out.println(description);   
   
    }
    
}

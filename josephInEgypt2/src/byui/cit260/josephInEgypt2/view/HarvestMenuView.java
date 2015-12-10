/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt2.view;

import byui.cit260.josephInEgypt2.control.GameControl;
import byui.cit260.josephInEgypt2.control.HarvestControl;
import byui.cit260.josephInEgypt2.control.ManufactureControl;
import byui.cit260.josephInEgypt2.exceptions.HarvestControlException;
import byui.cit260.josephInEgypt2.model.Cart;
import byui.cit260.josephInEgypt2.model.Location;
import java.awt.Point;
import java.util.Scanner;
import josephinegypt2.JosephInEgypt2;

/**
 *
 * @author Matt PC
 */
public class HarvestMenuView extends View {
    
    public HarvestMenuView(){
    super("\n" 
            +"\n----------------------------------------------"
            + "\n| Harvest Resources                            |"
            + "\n----------------------------------------------"
            + "\n How many resources would"
            + "\n you like to harvest?"
            + "\n *Harvest in increments of 2*"
            + "\nN - To enter number of resources"
            + "\nE - Exit"
            + "\n----------------------------------------------");
    }
    
    //do the action from the choice
    public boolean doAction(Object obj) {
        
        String value = (String)obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        switch (choice) {
            case 'N': // enter number
                this.resourceNumber();
                break;
            case 'E': // exit menu
                return true;
            default:
                ErrorView.display(this.getClass().getName(),"** Invalid selection ** Try again");
                break;      
        }
        return false;
    }
    //action called when N is selected
    private void resourceNumber() {

        //get brrels desired from user
        double noUnits = this.getUnitsNumber();
        double noBarrels = 0;  
        double unitsAvailable = 0;
        String description;
        int unitsLeft;
        String grain = "Grain";
        String honey = "Honey";
        String legume = "Legume";

        //get locations 
        Location[][] locations = JosephInEgypt2.getCurrentGame().getMap().getLocations();
        //get actor's current location
        Point currentLocation = JosephInEgypt2.getCurrentGame().getActor().getCoordinates();
        //get amount of resources available in location
        unitsAvailable = locations[currentLocation.x][currentLocation.y].getResourceAmount();
        //get scene description to check if it is a resource location
        description = locations[currentLocation.x][currentLocation.y].getResourceType();
        
        
        //get amount of EmptyBarrels
        noBarrels = JosephInEgypt2.getCurrentGame().getEmptySpot();
        
        //check to make sure player is in a resource location
        if (grain.equals(description) || honey.equals(description) || legume.equals(description)) {

            //use harvestControl to calculate if barrels can be built
            double remainingBarrels = this.calcHarvest(noUnits, noBarrels, unitsAvailable);

            //display message
            if (remainingBarrels >= 1) {
                this.console.println("You can harvest " + noUnits + " resources. "
                        + "Barrels filled.");
                //remove resources from location
                unitsLeft = (int) (unitsAvailable - noUnits);
                locations[currentLocation.x][currentLocation.y].setResourceAmount(unitsLeft);
                return;
            } else {
                ErrorView.display(this.getClass().getName(), "You do not have enough barrels."
                        + "Resources not harvested");
            }
            return;
        } else {
            ErrorView.display(this.getClass().getName(), "You are not in a location with resources to harvest.");
        }
        return;

    }   
    //get the barrel number from the user
    private double getUnitsNumber(){    
        boolean valid = false;
        double enteredValue = 0;
        
                
        Scanner keyboard = new Scanner(System.in);
        while (!valid) {
            this.console.println("Enter number of resources. 1 - 10");
            enteredValue = keyboard.nextDouble();
            
            if (enteredValue < 1 || enteredValue > 10 ){
            this.console.println ("Number must be between 1 and 10");
            continue;
            }
            break;
            }
        return enteredValue;
        }
        //call manufactureControl to perform calculations
    private double calcHarvest(double noUnits, double noBarrels, double unitsAvailable) {
        double remainingBarrels = 0.0;
        try{
        double emptyBarrels= noBarrels;
        double unitsDesired= noUnits;
        double resourceAvailable= unitsAvailable;
        HarvestControl harvestControl = new HarvestControl();
        remainingBarrels = harvestControl.harvestResource(unitsDesired, emptyBarrels, resourceAvailable);
        
        }catch (HarvestControlException he){
            System.out.println(he.getMessage());
            }
        return remainingBarrels;
    }
    
        
        
    }
    











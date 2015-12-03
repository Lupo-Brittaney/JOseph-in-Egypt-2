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
public class ConstructMenuView extends View {
    
    public ConstructMenuView() {
    super("\n" 
            +"\n----------------------------------------------"
            + "\n| Contruct Barrels                                  |"
            + "\n----------------------------------------------"
            + "\n How many barrels would"
            + "\nyou like to construct?"
            + "\nN - To enter number of barrels"
            + "\nE - Exit"
            + "\n----------------------------------------------");
}
    public boolean doAction(Object obj) {
        
        String value = (String)obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        switch (choice) {
            case 'N': // enter number
                this.barrelNumber();
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
    private void barrelNumber() {
        
        
        double woodAvailable = 10; //later will have to get this from inventory
        //get brrels desired from user
        double noBarrels = this.getBarrelNumber();
        //use manufactureControl to calculate if barrels can be built
        double remainingWood = this.calcBarrels(woodAvailable, noBarrels);
        //display message
        if (remainingWood >= 0 ){
            this.console.println("You can build " + noBarrels +" barrels. "
                    + "Barrels built.");
            //remove wood from inventory and add barrels to inventory
            return;}
        else 
            ErrorView.display(this.getClass().getName(),"You do not have enough wood."
                + "Barrels not built");
        return;
                    
        
    }    
    //get the barrel number from the user
    private double getBarrelNumber(){    
        boolean valid = false;
        double enteredValue = 0;
        
                
        Scanner keyboard = new Scanner(System.in);
        while (!valid) {
            this.console.println("Enter number of barrels. 1 - 10");
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
    private double calcBarrels(double woodAvailable, double noBarrels) {
        double woodStored= woodAvailable;
        double desiredBarrels= noBarrels;
        ManufactureControl manufactureControl = new ManufactureControl();
        double remainingWood = manufactureControl.calcBuild(woodStored, desiredBarrels);
        return remainingWood;
        
    }
    }










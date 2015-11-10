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
public class HelpMenuView extends View {
    public HelpMenuView () {
    super("\n"
            + "\n----------------------------------------------"
            + "\n| Help Menu                                  |"
            + "\n----------------------------------------------"
            + "\nO - Game objectives"
            + "\nM - How to move"
            + "\nH - How to harvest"
            + "\nD - How to collect wood"
            + "\nQ - Quit"
            + "\n----------------------------------------------");
}

    public boolean doAction(Object obj) {
        
        String value = (String)obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
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
                return false;
            default:
                System.out.println("\n** Invalid selection ** Try again");
                break;      
        }
        return true;
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

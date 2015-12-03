/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt2.view;

import byui.cit260.josephInEgypt2.control.GameControl;
import byui.cit260.josephInEgypt2.model.Cart;
import static java.time.Clock.system;
import java.util.Scanner;
import josephinegypt2.JosephInEgypt2;

/**
 *
 * @author Britt
 */
public class UnloadMenuView extends View {
    public UnloadMenuView(){
        super("\n"
            + "\n----------------------------------------------"
            + "\n| Unload Menu                                  |"
            + "\n----------------------------------------------"
            + "\nU -Unload Cart"
            + "\nE - Exit"
            + "\n----------------------------------------------");
        
    }
    

    @Override
    public boolean doAction(Object obj) {
         String value = (String)obj;
        
        value = value.toUpperCase();
        char choice = value.charAt(0);
        switch (choice) {
             case 'U': // unload cart
                this.unloadCart();
                break;
            case 'E': // Exit game
                return true;
            default:
                ErrorView.display(this.getClass().getName(),"** Invalid selection ** Try again");
                break;      
        }
        return false;
        }

    private void unloadCart() {
        //obtain contents of the cart
        this.cartContents();
        //add items from cart to amount stored
        this.addStored();
        //empty contents- set cart to empty
        this.emptyCart();
        
    }

           

    private void cartContents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void emptyCart() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void addStored() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

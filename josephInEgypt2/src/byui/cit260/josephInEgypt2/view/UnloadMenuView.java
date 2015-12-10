/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt2.view;

import byui.cit260.josephInEgypt2.control.GameControl;
import byui.cit260.josephInEgypt2.control.GameControl.Item;
import static byui.cit260.josephInEgypt2.control.GameControl.Item.grain;
import byui.cit260.josephInEgypt2.model.Cart;
import byui.cit260.josephInEgypt2.model.ResourceItem;
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

    private void unloadCart()  {
        String spot;
        String type = null;
        double cartAmount;
        double storedAmount;
        double newAmount;
        
        Cart[] cartSpot = GameControl.getCartSpotList();
        ResourceItem[] resourceList = GameControl.getSortedResourceList();
        for(int i=0; i<cartSpot.length; i++){
            if("grain".equals(type)){
                type= cartSpot[i].getResourceLoaded();
                cartAmount = cartSpot[i].getAmountLoaded();
                storedAmount= resourceList[Item.grain.ordinal()].getQuantityInStock();
                newAmount= cartAmount + storedAmount;
                cartSpot[i].setResourceLoaded("none");
                cartSpot[i].setAmountLoaded(0);
                cartSpot[i].setEmpBarrel(false);
                cartSpot[i].setEmpSpot(true);
            }else if ("legume".equals(type)){
                type= cartSpot[i].getResourceLoaded();
                cartAmount = cartSpot[i].getAmountLoaded();
                storedAmount= resourceList[Item.legume.ordinal()].getQuantityInStock();
                newAmount= cartAmount + storedAmount;
                cartSpot[i].setResourceLoaded("none");
                cartSpot[i].setAmountLoaded(0);
                cartSpot[i].setEmpBarrel(false);
                cartSpot[i].setEmpSpot(true);
                
                
            }else if("honey".equals(type)){
                type= cartSpot[i].getResourceLoaded();
                cartAmount = cartSpot[i].getAmountLoaded();
                storedAmount= resourceList[Item.honey.ordinal()].getQuantityInStock();
                newAmount= cartAmount + storedAmount;
                cartSpot[i].setResourceLoaded("none");
                cartSpot[i].setAmountLoaded(0);
                cartSpot[i].setEmpBarrel(false);
                cartSpot[i].setEmpSpot(true);
            }else if( "wood".equals(type)){
                type= cartSpot[i].getResourceLoaded();
                cartAmount = cartSpot[i].getAmountLoaded();
                storedAmount= resourceList[Item.wood.ordinal()].getQuantityInStock();
                newAmount= cartAmount + storedAmount;
                cartSpot[i].setResourceLoaded("none");
                cartSpot[i].setAmountLoaded(0);
                cartSpot[i].setEmpBarrel(false);
                cartSpot[i].setEmpSpot(true);
            }else 
                ErrorView.display(this.getClass().getName(),"** Error unloading cart");
                    
        
       
        
        }
    }

    
    
    
}

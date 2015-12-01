/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt2.control;

import byui.cit260.josephInEgypt2.exceptions.InventoryControlException;

/**
 *
 * @author Matt PC
 */
public class InventoryControl {

    public double collectMaterial(double noUnits, double cartSpace, double woodAvailable) 
                throws InventoryControlException{
	if (noUnits > woodAvailable || noUnits <1){
	throw new InventoryControlException("Invalid number entered");
        }
	if (cartSpace <1){
        throw new InventoryControlException("Not enough space in your cart");
        }
        double spaceNeeded= noUnits/ 2;
	double remainingSpaces=cartSpace- spaceNeeded;
	return remainingSpaces;
        }
    }


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt2.control;

/**
 *
 * @author Matt PC
 */
public class InventoryControl {

    public double collectMaterial(double noUnits, double cartSpace, double woodAvailable) {

	if (noUnits > woodAvailable || noUnits <1){
	return -1;
        }
	if (cartSpace <1){
        return -1;
        }
        double spaceNeeded= noUnits/ 2;
	double remainingSpaces=cartSpace- spaceNeeded;
	return remainingSpaces;
        }
    }


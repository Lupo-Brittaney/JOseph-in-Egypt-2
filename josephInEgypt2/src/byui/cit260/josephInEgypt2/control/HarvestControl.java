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
public class HarvestControl {
    
    //Brittaney's piece
    public double harvestResource( double unitsDesired, double emptyBarrels, double resourceAvailable){

	if (unitsDesired > resourceAvailable || unitsDesired <1){
	return -1;
        }
	if (emptyBarrels <1){
	return -1;
        }       
	double barrelsNeeded= unitsDesired /2;
	double remainingBarrels=emptyBarrels-barrelsNeeded;
        
        return remainingBarrels;
        
        /* if statements for later use
        if (remainingBarrels >=0)
	RETURN “You may harvest”+ desiredUnits +”units.”
	If (remainingSpaces <0)
	RETURN “Not enough empty barrels available.”*/
    }
}

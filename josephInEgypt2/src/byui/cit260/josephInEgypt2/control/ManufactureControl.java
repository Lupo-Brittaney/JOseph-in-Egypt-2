/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt2.control;

/**
 *
 * @author Britt
 */
public class ManufactureControl {
     public double calcBuild(double woodStored, double desiredBarrels){
         if (desiredBarrels >10 || desiredBarrels <1) { //desired barrels out of range
	return -1;
        }
	if (woodStored <2){ //not a vaild number of woodStored
	return -1;
        }
	double woodNeeded= desiredBarrels *2;
	double remainingWood=woodStored- woodNeeded;
         
        return remainingWood;
        
        /* if statements need for game use
        if (remainingWood >=0)
	RETURN “You may build”+ desiredBarrels + barrels”
	If (remainingSpaces <0)
	RETURN “Not enough wood available.”*/

         
     }
    
}

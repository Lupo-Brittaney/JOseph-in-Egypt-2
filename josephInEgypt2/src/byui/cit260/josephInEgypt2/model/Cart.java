/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt2.model;

import java.io.Serializable;

public class Cart implements Serializable{


	
        private int amountLoaded;
        private String resourceLoaded;
        
        private boolean empBarrel;
        private boolean empSpot;
        
        public Cart() {

            
            
    }


    

    public int getAmountLoaded() {
        return amountLoaded;
    }

    public void setAmountLoaded(int amountLoaded) {
        this.amountLoaded = amountLoaded;
    }

    public String getResourceLoaded() {
        return resourceLoaded;
    }

    public void setResourceLoaded(String resourceLoaded) {
        this.resourceLoaded = resourceLoaded;
    }

  

    public boolean isEmpBarrel() {
        return empBarrel;
    }

    public void setEmpBarrel(boolean empBarrel) {
        this.empBarrel = empBarrel;
    }

    public boolean isEmpSpot() {
        return empSpot;
    }

    public void setEmpSpot(boolean empSpot) {
        this.empSpot = empSpot;
    }

    
    
    
}


    



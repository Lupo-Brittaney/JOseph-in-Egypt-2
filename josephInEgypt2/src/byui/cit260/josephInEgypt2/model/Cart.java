/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt2.model;

import java.io.Serializable;

public class Cart implements Serializable{


	private int barrelsLoaded;
        private int maxCapacity;
	private int amountLoaded;
        
        public Cart() {
            this.maxCapacity = 10;
            this.amountLoaded = 0;
            this.barrelsLoaded= 0;
            
            
    }


    public int getBarrelsLoaded() {
        return barrelsLoaded;
    }

    public void setBarrelsLoaded(int barrelsLoaded) {
        this.barrelsLoaded = barrelsLoaded;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getAmountLoaded() {
        return amountLoaded;
    }

    public void setAmountLoaded(int amountLoaded) {
        this.amountLoaded = amountLoaded;
    }
    
    
}


    



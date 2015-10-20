/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt2.model;

import java.io.Serializable;

public class Cart implements Serializable{

	private int maxCapacity;
	private int amountLoaded;
	private int size;

	public double getMaxCapacity() {
                return maxCapacity;
	}


	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	public double getAmountLoaded() {
                return amountLoaded;
	}


	public void setAmountLoaded(int amountLoaded) {
		this.amountLoaded = amountLoaded;
	}

	public double getSize() {
                return size;
	}


	public void setSize(int size) {
		this.size = size;
	}

}
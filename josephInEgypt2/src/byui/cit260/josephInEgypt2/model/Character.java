/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt2.model;

import java.io.Serializable;

public class Character implements Serializable{
	private int name;
	private int ability;
	private int range;
	private int quantity;
        
        public Character () {
            
        }

	public double getName() {
                return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public double getAbility() {
                return ability;
	}

	public void setAbility(int ability) {
		this.ability = ability;
	}

	public double getRange() {
                return range;
	}


	public void setRange(int range) {
		this.range = range;
	}

	public double getQuantity() {
                return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
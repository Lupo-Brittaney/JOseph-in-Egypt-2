/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt2.model;

import java.io.Serializable;

public class Cart implements Serializable{

	private int barrelsLoaded;
	private int woodLoaded;
        private int spaceAvail;
        private int location;

    public int getBarrelsLoaded() {
        return barrelsLoaded;
    }

    public void setBarrelsLoaded(int barrelsLoaded) {
        this.barrelsLoaded = barrelsLoaded;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public int getWoodLoaded() {
        return woodLoaded;
    }

    public void setWoodLoaded(int woodLoaded) {
        this.woodLoaded = woodLoaded;
    }

    public int getSpaceAvail() {
        return spaceAvail;
    }

    public void setSpaceAvail(int spaceAvail) {
        this.spaceAvail = spaceAvail;
    }
}	
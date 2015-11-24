/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt2.model;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Britt
 */
public class Player implements Serializable{
    // class instance variables
    private String name;
    private double livesSaved;
   

    public Player() {
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLivesSaved() {
        return livesSaved;
    }

    public void setLivesSaved(double livesSaved) {
        this.livesSaved = livesSaved;
        
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", livesSaved=" + livesSaved + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.livesSaved) ^ (Double.doubleToLongBits(this.livesSaved) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (Double.doubleToLongBits(this.livesSaved) != Double.doubleToLongBits(other.livesSaved)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
}

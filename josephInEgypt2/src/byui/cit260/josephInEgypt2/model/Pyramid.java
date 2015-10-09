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
public class Pyramid implements Serializable{
    private String description;
    private String location;
    private double amountFilled;
    private double completionTime;

    public Pyramid() {
    }
  
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getAmountFilled() {
        return amountFilled;
    }

    public void setAmountFilled(double amountFilled) {
        this.amountFilled = amountFilled;
    }

    public double getCompletionTime() {
        return completionTime;
    }

    public void setCompletionTime(double completionTime) {
        this.completionTime = completionTime;
    }

    @Override
    public String toString() {
        return "Pyramid{" + "description=" + description + ", location=" + location + ", amountFilled=" + amountFilled + ", completionTime=" + completionTime + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.description);
        hash = 31 * hash + Objects.hashCode(this.location);
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.amountFilled) ^ (Double.doubleToLongBits(this.amountFilled) >>> 32));
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.completionTime) ^ (Double.doubleToLongBits(this.completionTime) >>> 32));
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
        final Pyramid other = (Pyramid) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        if (Double.doubleToLongBits(this.amountFilled) != Double.doubleToLongBits(other.amountFilled)) {
            return false;
        }
        if (Double.doubleToLongBits(this.completionTime) != Double.doubleToLongBits(other.completionTime)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
}

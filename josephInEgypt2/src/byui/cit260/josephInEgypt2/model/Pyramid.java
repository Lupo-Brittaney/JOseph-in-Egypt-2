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

  
    }

    
    
    
    
    


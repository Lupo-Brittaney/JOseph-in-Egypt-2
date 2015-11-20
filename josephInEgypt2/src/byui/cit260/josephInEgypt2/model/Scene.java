/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt2.model;

import java.io.Serializable;

/**
 *
 * @author Britt
 */
public class Scene implements Serializable{
    private String description;
       

    public Scene(){
        
        
        
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
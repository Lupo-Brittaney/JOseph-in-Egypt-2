/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt2.model;
import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author Britt
 */
public enum Actor implements Serializable{
    
    Joseph("He is the dirrector of storage");
    //class instance variables
    public final String description;
    public final Point coordinates;


    Actor(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }

    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }
  
}

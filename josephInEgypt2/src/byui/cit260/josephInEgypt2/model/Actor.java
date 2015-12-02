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
public class Actor implements Serializable{
    
    
    //class instance variables
    public String description;
    public Point coordinates;
    public String name;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Point coordinates) {
        this.coordinates = coordinates;
    }
    public void setCoordinates (int x, int y){
        Point pt = new Point(x,y);
        this.setCoordinates(pt);
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    
}
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
public class Location implements Serializable{
    private String visited;
    private double row;
    private double column;
    private String itemAvailable;
  
    
    

    public Location() {
    }
    

    public String getVisited() {
        return visited;
    }

    public void setVisited(String visited) {
        this.visited = visited;
    }

    public double getRow() {
        return row;
    }

    public void setRow(double row) {
        this.row = row;
    }

    public double getColumn() {
        return column;
    }

    public void setColumn(double column) {
        this.column = column;
    }

    public String getItemAvailable() {
        return itemAvailable;
    }

    public void setItemAvailable(String itemAvailable) {
        this.itemAvailable = itemAvailable;
    }
}

    
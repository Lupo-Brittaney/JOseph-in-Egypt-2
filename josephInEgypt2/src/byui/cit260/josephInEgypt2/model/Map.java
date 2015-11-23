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
public class Map implements Serializable{
    private int noOfRows;
    private int NoOfColumns;
    private Location[][] locations;

    public Map() {
    }

    public Map(int noOfRows, int noOfColumns) {
        
        if (noOfRows < 1 || noOfColumns < 1){
        System.out.println("The number os rows and columns must be > zero.");
        return;
        }
        
        this.noOfRows = noOfRows;
        this.NoOfColumns = noOfColumns;
        
        //create 2-d array for Location objects
        this.locations = new Location[noOfRows][NoOfColumns];
        
        for (int row = 0; row< noOfRows; row++){
            for(int column = 0; column< noOfColumns; column++){
                //create and initialize new Location object instance
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);
                
                //assign the Location object to the current position in array
                locations[row][column] = location;
            }
        }
        
    
    
    }
    
  

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    public int getNoOfRows() {
        return noOfRows;
    }

    public void setNoOfRows(int noOfRows) {
        this.noOfRows = noOfRows;
    }

    public int getNoOfColumns() {
        return NoOfColumns;
    }

    public void setNoOfColumns(int NoOfColumns) {
        this.NoOfColumns = NoOfColumns;
    }
    

    
    
    
    
}

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
    private double travelTime;
    private String itemStored;
    private String description;
    private String buildTools;
    private double woodAvailable;
    private double grainAvailable;
    private double legumeAvailable;
    private double honeyAvailable;
    
    

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

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public String getItemStored() {
        return itemStored;
    }

    public void setItemStored(String itemStored) {
        this.itemStored = itemStored;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBuildTools() {
        return buildTools;
    }

    public void setBuildTools(String buildTools) {
        this.buildTools = buildTools;
    }

    public double getWoodAvailable() {
        return woodAvailable;
    }

    public void setWoodAvailable(double woodAvailable) {
        this.woodAvailable = woodAvailable;
    }

    public double getGrainAvailable() {
        return grainAvailable;
    }

    public void setGrainAvailable(double grainAvailable) {
        this.grainAvailable = grainAvailable;
    }

    public double getLegumeAvailable() {
        return legumeAvailable;
    }

    public void setLegumeAvailable(double legumeAvailable) {
        this.legumeAvailable = legumeAvailable;
    }

    public double getHoneyAvailable() {
        return honeyAvailable;
    }

    public void setHoneyAvailable(double honeyAvailable) {
        this.honeyAvailable = honeyAvailable;
    }

   

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.visited);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.row) ^ (Double.doubleToLongBits(this.row) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.column) ^ (Double.doubleToLongBits(this.column) >>> 32));
        hash = 79 * hash + Objects.hashCode(this.itemAvailable);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.travelTime) ^ (Double.doubleToLongBits(this.travelTime) >>> 32));
        hash = 79 * hash + Objects.hashCode(this.itemStored);
        hash = 79 * hash + Objects.hashCode(this.description);
        hash = 79 * hash + Objects.hashCode(this.buildTools);
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
        final Location other = (Location) obj;
        if (!Objects.equals(this.visited, other.visited)) {
            return false;
        }
        if (Double.doubleToLongBits(this.row) != Double.doubleToLongBits(other.row)) {
            return false;
        }
        if (Double.doubleToLongBits(this.column) != Double.doubleToLongBits(other.column)) {
            return false;
        }
        if (!Objects.equals(this.itemAvailable, other.itemAvailable)) {
            return false;
        }
        if (Double.doubleToLongBits(this.travelTime) != Double.doubleToLongBits(other.travelTime)) {
            return false;
        }
        if (!Objects.equals(this.itemStored, other.itemStored)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.buildTools, other.buildTools)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "visited=" + visited + ", row=" + row + ", column=" + column + ", itemAvailable=" + itemAvailable + ", travelTime=" + travelTime + ", itemStored=" + itemStored + ", description=" + description + ", buildTools=" + buildTools + '}';
    }
    
    
    
}

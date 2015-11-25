/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt2.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
/**
 *
 * @author Britt
 */
public class Location implements Serializable{
    private boolean visited;
    private double row;
    private double column;
    private Scene scene;
    private ArrayList<Actor> actor;
    private int grain;
    private int wood;
    private int honey;
    private int legume;
    
    

    public Location() {
    }
    

    public boolean getVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
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

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public ArrayList<Actor> getActor() {
        return actor;
    }

    public void setActor(ArrayList<Actor> actor) {
        this.actor = actor;
    }

    public int getGrain() {
        return grain;
    }

    public void setGrain(int grain) {
        this.grain = grain;
    }

    public int getWood() {
        return wood;
    }

    public void setWood(int wood) {
        this.wood = wood;
    }

    public int getHoney() {
        return honey;
    }

    public void setHoney(int honey) {
        this.honey = honey;
    }

    public int getLegume() {
        return legume;
    }

    public void setLegume(int legume) {
        this.legume = legume;
    }
    

   
}

    

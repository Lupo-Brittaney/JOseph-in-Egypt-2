/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt2.model;

import byui.cit260.josephInEgypt2.control.GameControl;
import java.io.Serializable;
/**
 *
 * @author Britt
 */
public class Game implements Serializable{
    
    //class instance variables
    private double totalTime;
    
    
    private Map map;
    private Player player;
    private Pyramid pyramid;
    private Cart [] cartSpot;
    private ResourceItem[] resource;
    private String[] actor;
    
    public Game() {
    }

    public Pyramid getPyramid() {
        return pyramid;
    }

    public void setPyramid(Pyramid pyramid) {
        this.pyramid = pyramid;
    }

    public Cart[] getCartSpot() {
        return cartSpot;
    }

    public void setCart(Cart[] cartSpot) {
        this.cartSpot = cartSpot;
    }

    public ResourceItem[] getResource() {
        return resource;
    }

    public void setResource(ResourceItem[] resource) {
        this.resource = resource;
    }

    
    
    
    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

   

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String[] getActor() {
        return actor;
    }

    public void setActor(String[] actor) {
        this.actor = actor;
    }

    
    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime +  '}';
    }



 

    
    
    
    
}

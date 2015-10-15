/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josephinegypt2;

import byui.cit260.josephInEgypt2.model.Actor;
import byui.cit260.josephInEgypt2.model.Game;
import byui.cit260.josephInEgypt2.model.Location;
import byui.cit260.josephInEgypt2.model.Map;
import byui.cit260.josephInEgypt2.model.Player;
import byui.cit260.josephInEgypt2.model.Pyramid;

/**
 *
 * @author Britt
 */
public class JosephInEgypt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Player playerOne= new Player();
        
       // playerOne.setName("Joe Blue");
       // playerOne.setLivesSaved(2500);
        
        //String playerInfo = playerOne.toString();
        //System.out.println(playerInfo);
        
        runBrittCases();
        runMattCases();
        runChandlerCases();
        
        
        
        
    }
    private static void runChandlerCases(){
        
        
    }    

    private static void runMattCases(){
        
        
        
        
    }
    
    private static void runBrittCases(){
        Game gameOne = new Game();
        gameOne.setTotalTime(84);
        gameOne.setLivesSaved(10000);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
        
        Pyramid pyramidOne = new Pyramid();
        pyramidOne.setDescription("Resource");
        pyramidOne.setLocation("Name");
        pyramidOne.setAmountFilled(22);
        pyramidOne.setCompletionTime(55);
        
        String pyramidInfo= pyramidOne.toString();
        System.out.println(pyramidInfo);
        
        Map mapOne = new Map();
        mapOne.setRow(1);
        mapOne.setColumn(2);
        
        String mapInfo= mapOne.toString();
        System.out.println(mapInfo);
        
        Actor actorOne= new Actor();
        actorOne.setName("Joseph");
        actorOne.setDescription("describe");
        actorOne.setLocation("city name");
        
        String actorInfo= actorOne.toString();
        System.out.println(actorInfo);
        
        Location locationOne = new Location();
        locationOne.setVisited("yes");
        locationOne.setRow(1);
        locationOne.setColumn(1);
        locationOne.setItemAvailable("item");
        locationOne.setTravelTime(22);
        locationOne.setItemStored("item");
        locationOne.setDescription("ciry name");
        locationOne.setBuildTools("build");
        
        String locationInfo= locationOne.toString();
        System.out.println(locationInfo);
        
              
        
    }
    
}

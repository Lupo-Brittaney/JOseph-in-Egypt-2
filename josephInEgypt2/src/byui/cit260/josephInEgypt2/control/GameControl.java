/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt2.control;

import byui.cit260.josephInEgypt2.control.MapControl.SceneType;
import byui.cit260.josephInEgypt2.exceptions.GameControlException;
import byui.cit260.josephInEgypt2.model.Actor;
import byui.cit260.josephInEgypt2.model.Cart;
import byui.cit260.josephInEgypt2.model.Constants;
import byui.cit260.josephInEgypt2.model.Game;
import byui.cit260.josephInEgypt2.model.Location;
import byui.cit260.josephInEgypt2.model.Map;
import byui.cit260.josephInEgypt2.model.MoveCounter;
import byui.cit260.josephInEgypt2.model.Player;
import byui.cit260.josephInEgypt2.model.Pyramid;
import byui.cit260.josephInEgypt2.model.ResourceItem;
import byui.cit260.josephInEgypt2.model.Scene;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import josephinegypt2.JosephInEgypt2;

/**
 *
 * @author Matt PC
 */
public class GameControl {

    public static void createNewGame(Player player) {
        Game game = new Game(); //create new game
        JosephInEgypt2.setCurrentGame(game);
        
        game.setPlayer(player);// save player in game
        
        //create inventory list and save in game
        ResourceItem[] resourceList = GameControl.createResourceList();
        game.setResource(resourceList);
        
        //create actor
        Actor actorOne= new Actor();
        actorOne.setName("Joseph");
        actorOne.setDescription("describe");
        actorOne.setCoordinates(2,2);
        game.setActor(actorOne);
        
        //create pyramid
        Pyramid pyramid = new Pyramid();
        game.setPyramid(pyramid);//save in game
        
        //create a cart
        Cart[] cartSpot = GameControl.createCartContents();//create cart
        game.setCart(cartSpot);//save in game
        //create a map
        Map map = MapControl.createMap();//create map and initialize
        game.setMap(map);//save in game
        //create counter
        MoveCounter moveCounter= new MoveCounter();
        game.setMoveCounter(moveCounter);
        
        MapControl.moveActorsToStartingLocation(map);// move actors to starting location
    }
    
    public static Cart[] createCartContents() {
        Cart[] cartSpot = new Cart[10];
        
        Cart one = new Cart();
        one.setAmountLoaded(0);
        one.setEmpBarrel(false);
        one.setEmpSpot(true);
        one.setResourceLoaded("none");
        cartSpot[0] = one;
        
        Cart two = new Cart();
        two.setAmountLoaded(0);
        two.setEmpBarrel(false);
        two.setEmpSpot(true);
        two.setResourceLoaded("none");
        cartSpot[1] = two;
        
        Cart three = new Cart();
        three.setAmountLoaded(0);
        three.setEmpBarrel(false);
        three.setEmpSpot(true);
        three.setResourceLoaded("none");
        cartSpot[2] = three;
        
        Cart four = new Cart();
        four.setAmountLoaded(0);
        four.setEmpBarrel(false);
        four.setEmpSpot(true);
        four.setResourceLoaded("none");
        cartSpot[3] = four;
        
        Cart five = new Cart();
        five.setAmountLoaded(0);
        five.setEmpBarrel(false);
        five.setEmpSpot(true);
        five.setResourceLoaded("none");
        cartSpot[4] = five;
        
        Cart six = new Cart();
        six.setAmountLoaded(0);
        six.setEmpBarrel(false);
        six.setEmpSpot(true);
        six.setResourceLoaded("none");
        cartSpot[5] = six;
        
        Cart seven = new Cart();
        seven.setAmountLoaded(0);
        seven.setEmpBarrel(false);
        seven.setEmpSpot(true);
        seven.setResourceLoaded("none");
        cartSpot[6] = seven;
        
        Cart eight = new Cart();
        eight.setAmountLoaded(0);
        eight.setEmpBarrel(false);
        eight.setEmpSpot(true);
        eight.setResourceLoaded("none");
        cartSpot[7] = eight;
        
        Cart nine = new Cart();
        nine.setAmountLoaded(0);
        nine.setEmpBarrel(false);
        nine.setEmpSpot(true);
        nine.setResourceLoaded("none");
        cartSpot[8] = nine;
        
        Cart ten = new Cart();
        ten.setAmountLoaded(0);
        ten.setEmpBarrel(false);
        ten.setEmpSpot(true);
        ten.setResourceLoaded("none");
        cartSpot[9] = ten;
        
       
        
        
        return cartSpot;
        
    }

    public static Cart[] getCartSpotList() {
        //Get cart list for the current game
        Cart[] cartSpotList = JosephInEgypt2.getCurrentGame().getCartSpot();
                
        return cartSpotList;
    }

    public static void saveGame(Game game, String filepath) 
            throws GameControlException {
        try (FileOutputStream fops = new FileOutputStream(filepath)){
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game);//write game object to file
            
        }catch (IOException e){
            throw new GameControlException(e.getMessage());
        }
        
    }

    public static void getSavedGame(String filePath) 
        throws GameControlException{
        Game game = null;
        try(FileInputStream fips = new FileInputStream(filePath)){
            ObjectInputStream output = new ObjectInputStream(fips);
            
            game = (Game) output.readObject();//read game object from file
        }catch (FileNotFoundException fnfe){
            throw new GameControlException(fnfe.getMessage());
        }catch(Exception e){
            throw new GameControlException(e.getMessage());
        }
        //close the outpur file
        JosephInEgypt2.setCurrentGame(game);//save in JosephInEgypt2
        
    }

           
    public enum Item {
        wood,
        grain,
        legume,
        honey;
    }

    public static ResourceItem[] createResourceList() {
        
        ResourceItem[] resource =
                new ResourceItem[Constants.NUMBER_OF_RESOURCE_ITEMS];
        
        ResourceItem wood = new ResourceItem();
        wood.setDescription("wood");
        wood.setQuantityInStock(0);
        wood.setRequiredAmount(0);
        resource[Item.wood.ordinal()] = wood;
        
        ResourceItem grain = new ResourceItem();
        grain.setDescription("grain");
        grain.setQuantityInStock(0);
        grain.setRequiredAmount(20);
        resource[Item.grain.ordinal()] = grain;
        
        ResourceItem legume = new ResourceItem();
        legume.setDescription("legume");
        legume.setQuantityInStock(0);
        legume.setRequiredAmount(40);
        resource[Item.legume.ordinal()] = legume;
        
        
        ResourceItem honey = new ResourceItem();
        honey.setDescription("honey");
        honey.setQuantityInStock(0);
        honey.setRequiredAmount(2);
        resource[Item.honey.ordinal()] = honey;
        
        return resource;
    }
    
    public static ResourceItem[] getSortedResourceList() {
        //Get inventory list for the current game
        ResourceItem[] originalResourceList = JosephInEgypt2.getCurrentGame().getResource();
        
        //clone originalList
        ResourceItem[] resourceList = originalResourceList.clone();
        
        //using a bubbleSort to sort the list by name
        ResourceItem tempResourceItem;
        for (int i =0; i< resourceList.length-1; i++){
            for (int j = 0; j < resourceList.length-1-i; j++){
                if (resourceList[j].getDescription().compareToIgnoreCase(resourceList[j + 1].getDescription())>0){
                    tempResourceItem = resourceList[j];
                    resourceList[j]= resourceList[j+1];
                    resourceList[j+1] = tempResourceItem;
                }
            }
        }
        return resourceList;
    }
        


    
    
    public static void assignScenesToLocations(Map map, Scene[] scenes){
        Location[][] locations = map.getLocations();
        
        //city
        locations[2][2].setScene(scenes[SceneType.city.ordinal()]);
        locations[2][2].setVisited(true);
        //start point
        //locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
        //locations[0][0].setVisited(true);
        //finish point
        //locations[0][19].setScene(scenes[SceneType.finish.ordinal()]);
        //locations[0][19].setVisited(true);
        
        //grain locations
        locations[1][1].setScene(scenes[SceneType.grain.ordinal()]);
        locations[1][1].setVisited(false);
        locations[1][1].setResourceType("Grain");
        locations[1][1].setResourceAmount(4);
        
        locations[4][1].setScene(scenes[SceneType.grain.ordinal()]);
        locations[4][1].setVisited(false);
        locations[4][1].setResourceType("Grain");
        locations[4][1].setResourceAmount(4);
        
        locations[3][2].setScene(scenes[SceneType.grain.ordinal()]);
        locations[3][2].setVisited(false);
        locations[3][2].setResourceType("Grain");
        locations[3][2].setResourceAmount(4);
        
        locations[4][2].setScene(scenes[SceneType.grain.ordinal()]);
        locations[4][2].setVisited(false);
        locations[4][2].setResourceType("Grain");
        locations[4][2].setResourceAmount(4);
        
        locations[1][3].setScene(scenes[SceneType.grain.ordinal()]);
        locations[1][3].setVisited(false);
        locations[1][3].setResourceType("Grain");
        locations[1][3].setResourceAmount(4);
        
        locations[3][3].setScene(scenes[SceneType.grain.ordinal()]);
        locations[3][3].setVisited(false);
       locations[3][3].setResourceType("Grain");
        locations[3][3].setResourceAmount(4);
        
        locations[0][3].setScene(scenes[SceneType.grain.ordinal()]);
        locations[0][3].setVisited(false);
        locations[0][3].setResourceType("Grain");
        locations[0][3].setResourceAmount(4);
        
        locations[4][4].setScene(scenes[SceneType.grain.ordinal()]);
        locations[4][4].setVisited(false);
        locations[4][4].setResourceType("Grain");
        locations[4][4].setResourceAmount(4);
        
        locations[2][0].setScene(scenes[SceneType.grain.ordinal()]);
        locations[2][0].setVisited(false);
        locations[2][0].setResourceType("Grain");
        locations[2][0].setResourceAmount(4);
        
        locations[0][0].setScene(scenes[SceneType.grain.ordinal()]);
        locations[0][0].setVisited(false);
        locations[0][0].setResourceType("Grain");
        locations[0][0].setResourceAmount(4);
        
        //legume locations
        locations[2][1].setScene(scenes[SceneType.legume.ordinal()]);
        locations[2][1].setVisited(false);
       locations[2][1].setResourceType("Legume");
        locations[2][1].setResourceAmount(4);
        
        locations[3][1].setScene(scenes[SceneType.legume.ordinal()]);
        locations[3][1].setVisited(false);
        locations[3][1].setResourceType("Legume");
        locations[3][1].setResourceAmount(4);
                
        locations[0][1].setScene(scenes[SceneType.legume.ordinal()]);
        locations[0][1].setVisited(false);
        locations[0][1].setResourceType("Legume");
        locations[0][1].setResourceAmount(4);
                
        locations[1][2].setScene(scenes[SceneType.legume.ordinal()]);
        locations[1][2].setVisited(false);
        locations[1][2].setResourceType("Legume");
        locations[1][2].setResourceAmount(4);
        
        locations[2][3].setScene(scenes[SceneType.legume.ordinal()]);
        locations[2][3].setVisited(false);
        locations[2][3].setResourceType("Legume");
        locations[2][3].setResourceAmount(4);
                
        locations[4][3].setScene(scenes[SceneType.legume.ordinal()]);
        locations[4][3].setVisited(false);
        locations[4][3].setResourceType("Legume");
        locations[4][3].setResourceAmount(4);
        
        locations[3][4].setScene(scenes[SceneType.legume.ordinal()]);
        locations[3][4].setVisited(false);
        locations[3][4].setResourceType("Legume");
        locations[3][4].setResourceAmount(4);
                   
        locations[1][0].setScene(scenes[SceneType.legume.ordinal()]);
        locations[1][0].setVisited(false);
        locations[1][0].setResourceType("Legume");
        locations[1][0].setResourceAmount(4);
                 
        locations[3][0].setScene(scenes[SceneType.legume.ordinal()]);
        locations[3][0].setVisited(false);
        locations[3][0].setResourceType("Legume");
        locations[3][0].setResourceAmount(4);
                
        locations[4][0].setScene(scenes[SceneType.legume.ordinal()]);
        locations[4][0].setVisited(false);
        locations[4][0].setResourceType("Legume");
        locations[4][0].setResourceAmount(4);
        
        //honey locations
        locations[0][2].setScene(scenes[SceneType.honey.ordinal()]);
        locations[0][2].setVisited(false);
        locations[0][2].setResourceType("Honey");
        locations[0][2].setResourceAmount(2);
                
        locations[1][4].setScene(scenes[SceneType.honey.ordinal()]);
        locations[1][4].setVisited(false);
        locations[1][4].setResourceType("Honey");
        locations[1][4].setResourceAmount(2);
                
        locations[2][4].setScene(scenes[SceneType.honey.ordinal()]);
        locations[2][4].setVisited(false);
        locations[2][4].setResourceType("Honey");
        locations[2][4].setResourceAmount(2);
                
        locations[0][4].setScene(scenes[SceneType.honey.ordinal()]);
        locations[0][4].setVisited(false);
        locations[0][4].setResourceType("Honey");
        locations[0][4].setResourceAmount(2);
        
        
    }
    
   
}

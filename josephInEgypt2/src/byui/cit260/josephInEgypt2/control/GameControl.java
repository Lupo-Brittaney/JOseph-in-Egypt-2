/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt2.control;

import byui.cit260.josephInEgypt2.control.MapControl.SceneType;
import byui.cit260.josephInEgypt2.model.Cart;
import byui.cit260.josephInEgypt2.model.Constants;
import byui.cit260.josephInEgypt2.model.Game;
import byui.cit260.josephInEgypt2.model.Location;
import byui.cit260.josephInEgypt2.model.Map;
import byui.cit260.josephInEgypt2.model.Player;
import byui.cit260.josephInEgypt2.model.Pyramid;
import byui.cit260.josephInEgypt2.model.ResourceItem;
import byui.cit260.josephInEgypt2.model.Scene;

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
        
        //create pyramid
        Pyramid pyramid = new Pyramid();
        game.setPyramid(pyramid);//save in game
        
        Cart[] cartSpot = GameControl.createCartContents();//create cart
        game.setCart(cartSpot);//save in game
        
        Map map = MapControl.createMap();//create map and initialize
        game.setMap(map);//save in game
        
        MapControl.moveActorsToStartingLocation(map);// move actors to starting location
    }
    
    public static Cart[] createCartContents() {
        Cart[] cartSpot = new Cart[10];
        
        Cart one = new Cart();
        one.setAmountLoaded(0);
        one.setBarrelsLoaded(0);
        one.setResourceLoaded("none");
        cartSpot[0] = one;
        
        Cart two = new Cart();
        two.setAmountLoaded(0);
        two.setBarrelsLoaded(0);
        two.setResourceLoaded("none");
        cartSpot[1] = two;
        
        Cart three = new Cart();
        three.setAmountLoaded(0);
        three.setBarrelsLoaded(0);
        three.setResourceLoaded("none");
        cartSpot[2] = three;
        
        Cart four = new Cart();
        four.setAmountLoaded(0);
        four.setBarrelsLoaded(0);
        four.setResourceLoaded("none");
        cartSpot[3] = four;
        
        Cart five = new Cart();
        five.setAmountLoaded(0);
        five.setBarrelsLoaded(0);
        five.setResourceLoaded("none");
        cartSpot[4] = five;
        
        Cart six = new Cart();
        six.setAmountLoaded(0);
        six.setBarrelsLoaded(0);
        six.setResourceLoaded("none");
        cartSpot[5] = six;
        
        Cart seven = new Cart();
        seven.setAmountLoaded(0);
        seven.setBarrelsLoaded(0);
        seven.setResourceLoaded("none");
        cartSpot[6] = seven;
        
        Cart eight = new Cart();
        eight.setAmountLoaded(0);
        eight.setBarrelsLoaded(0);
        eight.setResourceLoaded("none");
        cartSpot[7] = eight;
        
        Cart nine = new Cart();
        nine.setAmountLoaded(0);
        nine.setBarrelsLoaded(0);
        nine.setResourceLoaded("none");
        cartSpot[8] = nine;
        
        Cart ten = new Cart();
        ten.setAmountLoaded(0);
        ten.setBarrelsLoaded(0);
        ten.setResourceLoaded("none");
        cartSpot[9] = ten;
        
       
        
        
        return cartSpot;
        
    }

    public static Cart[] getCartSpotList() {
        //Get cart list for the current game
        Cart[] cartSpotList = JosephInEgypt2.getCurrentGame().getCartSpot();
                
        return cartSpotList;
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
        locations [1][1].setGrain(4);
        
        locations[4][1].setScene(scenes[SceneType.grain.ordinal()]);
        locations[4][1].setVisited(false);
        locations[4][1].setGrain(6);
        
        locations[3][2].setScene(scenes[SceneType.grain.ordinal()]);
        locations[3][2].setVisited(false);
        locations[3][2].setGrain(4);
        
        locations[4][2].setScene(scenes[SceneType.grain.ordinal()]);
        locations[4][2].setVisited(false);
        locations[4][2].setGrain(6);
        
        locations[1][3].setScene(scenes[SceneType.grain.ordinal()]);
        locations[1][3].setVisited(false);
        locations[1][3].setGrain(4);
        
        locations[3][3].setScene(scenes[SceneType.grain.ordinal()]);
        locations[3][3].setVisited(false);
        locations[3][3].setGrain(6);
        
        locations[0][3].setScene(scenes[SceneType.grain.ordinal()]);
        locations[0][3].setVisited(false);
        locations[0][3].setGrain(4);
        
        locations[4][4].setScene(scenes[SceneType.grain.ordinal()]);
        locations[4][4].setVisited(false);
        locations[4][4].setGrain(4);
        
        locations[2][0].setScene(scenes[SceneType.grain.ordinal()]);
        locations[2][0].setVisited(false);
        locations[2][0].setGrain(4);
        
        locations[0][0].setScene(scenes[SceneType.grain.ordinal()]);
        locations[0][0].setVisited(false);
        locations[0][0].setGrain(4);
        
        //legume locations
        locations[2][1].setScene(scenes[SceneType.legume.ordinal()]);
        locations[2][1].setVisited(false);
        locations[2][1].setLegume(4);
        
        locations[3][1].setScene(scenes[SceneType.legume.ordinal()]);
        locations[3][1].setVisited(false);
        locations[3][1].setLegume(6);
                
        locations[0][1].setScene(scenes[SceneType.legume.ordinal()]);
        locations[0][1].setVisited(false);
        locations[0][1].setLegume(6);
                
        locations[1][2].setScene(scenes[SceneType.legume.ordinal()]);
        locations[1][2].setVisited(false);
        locations[1][2].setLegume(6);
        
        locations[2][3].setScene(scenes[SceneType.legume.ordinal()]);
        locations[2][3].setVisited(false);
        locations[2][3].setLegume(6);
                
        locations[4][3].setScene(scenes[SceneType.legume.ordinal()]);
        locations[4][3].setVisited(false);
        locations[4][3].setLegume(6);
        
        locations[3][4].setScene(scenes[SceneType.legume.ordinal()]);
        locations[3][4].setVisited(false);
        locations[3][4].setLegume(6);
                   
        locations[1][0].setScene(scenes[SceneType.legume.ordinal()]);
        locations[1][0].setVisited(false);
        locations[1][0].setLegume(6);
                 
        locations[3][0].setScene(scenes[SceneType.legume.ordinal()]);
        locations[3][0].setVisited(false);
        locations[3][0].setLegume(6);
                
        locations[4][0].setScene(scenes[SceneType.legume.ordinal()]);
        locations[4][0].setVisited(false);
        locations[4][0].setLegume(6);
        
        //honey locations
        locations[0][2].setScene(scenes[SceneType.honey.ordinal()]);
        locations[0][2].setVisited(false);
        locations[0][2].setHoney(2);
                
        locations[1][4].setScene(scenes[SceneType.honey.ordinal()]);
        locations[1][4].setVisited(false);
        locations[1][4].setHoney(2);
                
        locations[2][4].setScene(scenes[SceneType.honey.ordinal()]);
        locations[2][4].setVisited(false);
        locations[2][4].setHoney(2);
                
        locations[0][4].setScene(scenes[SceneType.honey.ordinal()]);
        locations[0][4].setVisited(false);
        locations[0][4].setHoney(2);
        
        
    }
    
   
}

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
        
        Cart cart = new Cart();//create cart
        game.setCart(cart);//save in game
        
        Map map = MapControl.createMap();//create map and initialize
        game.setMap(map);//save in game
        
        MapControl.moveActorsToStartingLocation(map);// move actors to starting location
    }

    public static ResourceItem[] getSortedInventoryList() {
        //Get inventory list for the current game
        ResourceItem[] originalInventoryList = JosephInEgypt2.getCurrentGame().getResource();
        
        //clone originalList
        ResourceItem[] inventoryList = originalInventoryList.clone();
        
        //using a bubbleSort to sort the list by name
        ResourceItem tempResourceItem;
        for (int i =0; i< inventoryList.length-1; i++){
            for (int j = 0; j < inventoryList.length-1-i; j++){
                if (inventoryList[j].getDescription().compareToIgnoreCase(inventoryList[j +1].getDescription())>0){
                    tempResourceItem = inventoryList[j];
                    inventoryList[j]= inventoryList[j+1];
                    inventoryList[j+1] = tempResourceItem;
                }
            }
        }
        return inventoryList;
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
        wood.setDescription("Wood");
        wood.setQuantityInStock(0);
        wood.setRequiredAmount(0);
        resource[Item.wood.ordinal()] = wood;
        
        ResourceItem grain = new ResourceItem();
        grain.setDescription("Grain");
        grain.setQuantityInStock(0);
        grain.setRequiredAmount(10);
        resource[Item.grain.ordinal()] = grain;
        
        ResourceItem legume = new ResourceItem();
        grain.setDescription("Legume");
        grain.setQuantityInStock(0);
        grain.setRequiredAmount(10);
        resource[Item.legume.ordinal()] = legume;
        
        ResourceItem honey = new ResourceItem();
        honey.setDescription("Honey");
        honey.setQuantityInStock(0);
        honey.setRequiredAmount(2);
        resource[Item.honey.ordinal()] = honey;
        
        return resource;
    }
    
    
    public static void assignScenesToLocations(Map map, Scene[] scenes){
        Location[][] locations = map.getLocations();
        
        //city
        locations[10][10].setScene(scenes[SceneType.city.ordinal()]);
        //start point
        locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
        //finish point
        locations[0][19].setScene(scenes[SceneType.finish.ordinal()]);
        
        //grain locations
        locations[0][3].setScene(scenes[SceneType.grain.ordinal()]);
        locations[2][16].setScene(scenes[SceneType.grain.ordinal()]);
        locations[0][15].setScene(scenes[SceneType.grain.ordinal()]);
        locations[10][13].setScene(scenes[SceneType.grain.ordinal()]);
        locations[5][6].setScene(scenes[SceneType.grain.ordinal()]);
        locations[8][3].setScene(scenes[SceneType.grain.ordinal()]);
        locations[12][1].setScene(scenes[SceneType.grain.ordinal()]);
        locations[15][11].setScene(scenes[SceneType.grain.ordinal()]);
        locations[18][2].setScene(scenes[SceneType.grain.ordinal()]);
        locations[1][5].setScene(scenes[SceneType.grain.ordinal()]);
        
        //legume locations
        locations[15][4].setScene(scenes[SceneType.legume.ordinal()]);
        locations[10][14].setScene(scenes[SceneType.legume.ordinal()]);
        locations[12][5].setScene(scenes[SceneType.legume.ordinal()]);
        locations[3][19].setScene(scenes[SceneType.legume.ordinal()]);
        locations[6][7].setScene(scenes[SceneType.legume.ordinal()]);
        locations[9][4].setScene(scenes[SceneType.legume.ordinal()]);
        locations[11][2].setScene(scenes[SceneType.legume.ordinal()]);
        locations[10][18].setScene(scenes[SceneType.legume.ordinal()]);
        locations[18][18].setScene(scenes[SceneType.legume.ordinal()]);
        
        
        //honey locations
        locations[19][19].setScene(scenes[SceneType.honey.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.honey.ordinal()]);
        
        
        
        
    }
}

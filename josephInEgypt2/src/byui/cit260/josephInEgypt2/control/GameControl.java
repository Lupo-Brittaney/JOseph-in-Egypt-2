/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt2.control;

import byui.cit260.josephInEgypt2.model.Cart;
import byui.cit260.josephInEgypt2.model.Game;
import byui.cit260.josephInEgypt2.model.Map;
import byui.cit260.josephInEgypt2.model.Player;
import byui.cit260.josephInEgypt2.model.Pyramid;
import byui.cit260.josephInEgypt2.model.ResourceItem;
import javafx.scene.Scene;
import josephinegypt2.JosephInEgypt2;

/**
 *
 * @author Matt PC
 */
public class GameControl {

    public static void createNewGame(Player player) {
        Game game = new Game();
        JosephInEgypt2.setCurrentGame(game);
        
        game.setPlayer(player);
        
        ResourceItem[] resourceList = GameControl.createResourceList();
        game.setResource(resourceList);
        
        Pyramid pyramid = new Pyramid();
        game.setPyramid(pyramid);
        
        Cart cart = new Cart();
        game.setCart(cart);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        MapControl.moveActorsToStartingLocation(map);
    }

    static void assignScenesToLocations(Map map, Scene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
}

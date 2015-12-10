/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt2.control;

import byui.cit260.josephInEgypt2.model.Actor;
import byui.cit260.josephInEgypt2.model.Game;
import byui.cit260.josephInEgypt2.model.Map;
import byui.cit260.josephInEgypt2.model.Scene;
import java.awt.Point;
import josephinegypt2.JosephInEgypt2;


/**
 *
 * @author Matt PC
 */
public class MapControl {
    

    static void moveActorsToStartingLocation(Map map) {
        
        
        
    }

    public static Map createMap() {
        //create the map
        Map map = new Map(5, 5);
        //create a list of the differetn scenes
        Scene[] scenes = createScenes();
        //assign the different scenes to locations in the map
        GameControl.assignScenesToLocations(map, scenes);
        
        return map;
    }
    
    public enum SceneType {
        start,
        finish,
        honey,
        grain,
        legume,
        city;
    }

    private static Scene[] createScenes() {
        Game game = JosephInEgypt2.getCurrentGame();
        
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                " This is the beginning.");
        startingScene.setSymbol("S");
        startingScene.setBlocked(false);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        
        Scene finishScene = new Scene();
        finishScene.setDescription(
                "This is the end.");
        finishScene.setSymbol("F");
        finishScene.setBlocked(false);
        scenes[SceneType.finish.ordinal()]= finishScene;
        
        Scene grainScene = new Scene();
        grainScene.setDescription(
                "Grain");
        grainScene.setSymbol("G");
        grainScene.setBlocked(false);
        scenes[SceneType.grain.ordinal()]= grainScene;
        
         Scene legumeScene = new Scene();
        legumeScene.setDescription(
                "Legume");
        legumeScene.setSymbol("L");
        legumeScene.setBlocked(false);
        scenes[SceneType.legume.ordinal()]= legumeScene;
        
        Scene honeyScene = new Scene();
        honeyScene.setDescription(
                "Honey");
        honeyScene.setSymbol("H");
        honeyScene.setBlocked(false);
        scenes[SceneType.honey.ordinal()]= honeyScene;
        
        Scene cityScene = new Scene();
        cityScene.setDescription(
                "This is the city.");
        cityScene.setSymbol("C");
        cityScene.setBlocked(false);
        scenes[SceneType.city.ordinal()]= cityScene;
        
        return scenes;
    }
        
        
        
    
    
}

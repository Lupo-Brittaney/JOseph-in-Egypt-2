/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt2.control;

import byui.cit260.josephInEgypt2.model.Map;
import javafx.scene.Scene;

/**
 *
 * @author Matt PC
 */
public class MapControl {
    

    static void moveActorsToStartingLocation(Map map) {
    }

    public static Map createMap() {
        
        Map map = new Map(20, 20);
        
        Scene[] scenes = createScenes();
        
        GameControl.assignScenesToLocations(map, scenes);
        
        return map;
    }
    
    public enum SceneType {
        
    }

    private static Scene[] createScenes() {
        Game game = JosephInEgypt2.getCurrentGame();
        
        
    }
    
}

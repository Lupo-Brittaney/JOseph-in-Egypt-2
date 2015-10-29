/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt2.control;

import byui.cit260.josephInEgypt2.model.Player;
import josephinegypt2.JosephInEgypt2;

/**
 *
 * @author Britt
 */
public class ProgramControl {

    public static Player createPlayer(String name) {
       
        if (name == null){
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        JosephInEgypt2.setPlayer(player); // save the player
        
        return player;
    }
    
}

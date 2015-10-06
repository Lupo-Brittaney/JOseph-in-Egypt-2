/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josephinegypt2;

import byui.cit260.josephInEgypt2.model.Player;

/**
 *
 * @author Britt
 */
public class JosephInEgypt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne= new Player();
        
        playerOne.setName("Joe Blue");
        playerOne.setLivesSaved(2500);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    }
    
}

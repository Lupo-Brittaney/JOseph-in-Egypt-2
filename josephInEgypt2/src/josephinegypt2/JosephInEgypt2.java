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
import byui.cit260.josephInEgypt2.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Britt
 */
public class JosephInEgypt2 {
    
    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile= null;
    private static BufferedReader inFile= null;
    
    private static PrintWriter logFile = null;
    
    public static void main(String[] args){
       try{
        //open character stream files for end user input and output
        JosephInEgypt2.inFile = new BufferedReader(new InputStreamReader(System.in));
        JosephInEgypt2.outFile= new PrintWriter(System.out, true);
        
        //open log file
        String filePath = "log.txt";
        JosephInEgypt2.logFile = new PrintWriter(filePath);
        
        // create StartProgramView and start the program
        StartProgramView startProgramView = new StartProgramView();
        
        startProgramView.startProgram();
        }catch (Throwable te){
            System.out.println(te.getMessage());
            te.printStackTrace();
            //startProgramView.startProgram();
        }
        finally {
           try {
               if (JosephInEgypt2.inFile != null)
                   JosephInEgypt2.inFile.close();
               if (JosephInEgypt2.outFile !=null)
                   JosephInEgypt2.outFile.close();
               if (JosephInEgypt2.logFile != null)
                   JosephInEgypt2.logFile.close();
               
           } catch (IOException ex) {
               System.out.println("Error closing files");
               return;
               
           }
           
       } 
        
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        JosephInEgypt2.logFile = logFile;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        JosephInEgypt2.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        JosephInEgypt2.inFile = inFile;
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        JosephInEgypt2.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        JosephInEgypt2.player = player;
    }
    
    
}



    /**
     * @param args the command line arguments
     
    public static void main(String[] args) {
       // Player playerOne= new Player();
        
       // playerOne.setName("Joe Blue");
       // playerOne.setLivesSaved(2500);
        
        //String playerInfo = playerOne.toString();
        //System.out.println(playerInfo);
        
        runBrittCases();
        runMattCases();
        
        
        
        
        
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
        */
    
         
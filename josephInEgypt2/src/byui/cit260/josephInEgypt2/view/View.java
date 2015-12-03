/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt2.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import josephinegypt2.JosephInEgypt2;

/**
 *
 * @author Matt PC
 */
public abstract class View implements ViewInterface {
   
    private String promptMessage;
    
    protected final BufferedReader keyboard = JosephInEgypt2.getInFile();
    protected final PrintWriter console = JosephInEgypt2.getOutFile();
    
    public View(String promptMessage) {
        this.promptMessage = promptMessage;
    }
    
    
    @Override
    public void display() {
        String value = "";
        boolean done = false;
        
        do {
            this.console.println(this.promptMessage); //display prompt message
            value = this.getInput(); // get value 
            done = this.doAction(value);
        } while (!done);
       }
    @Override
    public String getInput() {
        
        boolean valid = false;
        String value = null;
        try{
        // while a valid name has not been retrieved
        while (!valid) {
            
            // get value from keyboard
            value = this.keyboard.readLine();
            value = value.trim();
            
            if (value.length() < 1) {
                this.console.println("You must enter a value");
                continue;
            }
            break;
        }
        }catch (Exception e){
            System.out.println("error reading input:" + e.getMessage());
        }
        return value;    
}


public String getPromptMessage() {
    return promptMessage;
}

public void setPromptMessage(String message) {
    this.promptMessage = message;
}
}

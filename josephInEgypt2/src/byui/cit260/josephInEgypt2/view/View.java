/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt2.view;

import java.util.Scanner;

/**
 *
 * @author Matt PC
 */
public abstract class View implements ViewInterface {
   
    private String promptMessage;
    
    public View(String promptMessage) {
        this.promptMessage = promptMessage;
    }
    
    
    @Override
    public void display() {
        String value = "";
        boolean done = false;
        
        do {
            System.out.println(this.promptMessage); //display prompt message
            value = this.getInput(); // get value 
            done = this.doAction(value);
        } while (!done);
       }
    @Override
    public String getInput() {
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String value = null;
        
        // while a valid name has not been retrieved
        while (!valid) {
            
            // get value from keyboard
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 1) {
                System.out.println("You must enter a value");
                continue;
            }
            break;
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

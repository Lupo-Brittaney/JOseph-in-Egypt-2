/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt2.view;

import java.io.PrintWriter;
import josephinegypt2.JosephInEgypt2;


/**
 *
 * @author Britt
 */
public class ErrorView {
    private static final PrintWriter errorFile = JosephInEgypt2.getOutFile();
    private static final PrintWriter logFile = JosephInEgypt2.getLogFile();
    public static void display(String className, String errorMessage){
        
        errorFile.println(
                "----------------------------------------------------------------"
                + "\n - Error - " + errorMessage
                +"\n-------------------------------------------------------------");
        
        //log error
        logFile.println(className + " - " + errorMessage);
 
    }
    
    
}

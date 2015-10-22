/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt2.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Britt
 */
public class ManufactureControlTest {
    
    public ManufactureControlTest() {
    }

    /**
     * Test of calcBuild method, of class manufactureControl.
     */
    @Test
    public void testCalcBuild() {
        System.out.println("calcBuild");
        
        /*Test Case 1*/
        System.out.println("\tTest case #1");
        
        //input values for test case 1
        double woodStored = 8.0;
        double desiredBarrels = 4.0;
       
        double expResult = 0.0; //expected output returned value
        
        //creat instance of manufactureControl class
        ManufactureControl instance= new ManufactureControl();
        
        //call function to run test
        double result = instance.calcBuild(woodStored, desiredBarrels);
        
        //compare expected return value with actual return value
        assertEquals(expResult, result, 0.0);
        
         /*Test Case 2*/
        System.out.println("\tTest case #2");
        
        //input values for test case 2
        woodStored = 2.0;
        desiredBarrels = 0.0;
       
        expResult = -1.0; //expected output returned value
        
                
        //call function to run test
        result = instance.calcBuild(woodStored, desiredBarrels);
        
        //compare expected return value with actual return value
        assertEquals(expResult, result, 0.0);
        
          /*Test Case 3*/
        System.out.println("\tTest case #3");
        
        //input values for test case 3
        woodStored = 0.0;
        desiredBarrels = 4.0;
       
        expResult = -1.0; //expected output returned value
        
                
        //call function to run test
        result = instance.calcBuild(woodStored, desiredBarrels);
        
        //compare expected return value with actual return value
        assertEquals(expResult, result, 0.0);
        
           /*Test Case 4*/
        System.out.println("\tTest case #4");
        
        //input values for test case 4
        woodStored = 22.0;
        desiredBarrels = 11.0;
       
        expResult = -1.0; //expected output returned value
        
                
        //call function to run test
        result = instance.calcBuild(woodStored, desiredBarrels);
        
        //compare expected return value with actual return value
        assertEquals(expResult, result, 0.0);
    
     /*Test Case 5*/
        System.out.println("\tTest case #5");
        
        //input values for test case 5
        woodStored = 6.0;
        desiredBarrels = 1.0;
       
        expResult = 4.0; //expected output returned value
        
                
        //call function to run test
        result = instance.calcBuild(woodStored, desiredBarrels);
        
        //compare expected return value with actual return value
        assertEquals(expResult, result, 0.0);
        
        /*Test Case 6*/
        System.out.println("\tTest case #6");
        
        //input values for test case 6
        woodStored = 20.0;
        desiredBarrels = 10.0;
       
        expResult = 0.0; //expected output returned value
        
                
        //call function to run test
        result = instance.calcBuild(woodStored, desiredBarrels);
        
        //compare expected return value with actual return value
        assertEquals(expResult, result, 0.0);
        
        /*Test Case 7*/
        System.out.println("\tTest case #7");
        
        //input values for test case 7
        woodStored = 2.0;
        desiredBarrels = 1.0;
       
        expResult = 0.0; //expected output returned value
        
                
        //call function to run test
        result = instance.calcBuild(woodStored, desiredBarrels);
        
        //compare expected return value with actual return value
        assertEquals(expResult, result, 0.0);
    }
    
    }
    

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
public class HarvestControlTest {
    
    public HarvestControlTest() {
    }

    /**
     * Test of harvestResource method, of class HarvestControl.
     */
    @Test
    public void testHarvestResource() {
        System.out.println("harvestResource");
        
        //Test Case #1
        System.out.println("\tTest case #1");
        
        //input values for test case
        double unitsDesired = 2.0;
        double emptyBarrels = 4.0;
        double resourceAvailable = 20.0; 
        
        //expected output returned value
        double expResult = 3.0;
        
        //creste instance of HarvestControl
        HarvestControl instance = new HarvestControl();
        
        //call a function to run test        
        double result = instance.harvestResource(unitsDesired, emptyBarrels, resourceAvailable);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        
         //Test Case #2
        System.out.println("\tTest case #2");
        
        //input values for test case
        unitsDesired = 2.0;
        emptyBarrels = 0.0;
        resourceAvailable = 20.0; 
        
        //expected output returned value
        expResult = -1.0;
                
        //call a function to run test        
        result = instance.harvestResource(unitsDesired, emptyBarrels, resourceAvailable);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        
        //Test Case #3
        System.out.println("\tTest case #3");
        
        //input values for test case
        unitsDesired = 0.0;
        emptyBarrels = 4.0;
        resourceAvailable = 20.0; 
        
        //expected output returned value
        expResult = -1.0;
                
        //call a function to run test        
        result = instance.harvestResource(unitsDesired, emptyBarrels, resourceAvailable);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        
        //Test Case #4
        System.out.println("\tTest case #4");
        
        //input values for test case
        unitsDesired = 22.0;
        emptyBarrels = 4.0;
        resourceAvailable = 20.0; 
        
        //expected output returned value
        expResult = -1.0;
                
        //call a function to run test        
        result = instance.harvestResource(unitsDesired, emptyBarrels, resourceAvailable);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        
        //Test Case #5
        System.out.println("\tTest case #5");
        
        //input values for test case
        unitsDesired = 1.0;
        emptyBarrels = 1.0;
        resourceAvailable = 20.0; 
        
        //expected output returned value
        expResult = 0.5;
                
        //call a function to run test        
        result = instance.harvestResource(unitsDesired, emptyBarrels, resourceAvailable);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        
        //Test Case #6
        System.out.println("\tTest case #6");
        
        //input values for test case
        unitsDesired = 20.0;
        emptyBarrels = 10.0;
        resourceAvailable = 20.0; 
        
        //expected output returned value
        expResult = 0.0;
                
        //call a function to run test        
        result = instance.harvestResource(unitsDesired, emptyBarrels, resourceAvailable);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        
        //Test Case #7
        System.out.println("\tTest case #7");
        
        //input values for test case
        unitsDesired = 2.0;
        emptyBarrels = 1.0;
        resourceAvailable = 20.0; 
        
        //expected output returned value
        expResult = 0.0;
                
        //call a function to run test        
        result = instance.harvestResource(unitsDesired, emptyBarrels, resourceAvailable);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
    }
    
}

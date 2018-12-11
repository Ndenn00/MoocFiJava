/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author niald
 */
public class NumberStatisticsTestTDD {
    NumberStatistics numberStatistics;

    public NumberStatisticsTestTDD() {
    }

    @Before
    public void setUp() {
        
    }

    @Test
    public void numberStatistics_zero_zero_defaultConstructor() {
        numberStatistics = new NumberStatistics(); 
        int amountOfNumbers = 0;  
        
        assertEquals(amountOfNumbers, numberStatistics.getAmountOfNumbers());
        
    }
    
    @Test
    public void addNumber_zeroToOne_zeroToOne_happyPath(){
        numberStatistics = new NumberStatistics(); 
        int amountOfNumbers = 1; 
        
        numberStatistics.addNumber(1); 
        
        assertEquals(amountOfNumbers, numberStatistics.getAmountOfNumbers());
    }
    
    @Test
    public void amountOfNumbers_zero_zero_happyPath(){
        numberStatistics = new NumberStatistics(); 
        int amountOfNumbers = 0; 
        
        assertEquals(amountOfNumbers, numberStatistics.amountOfNumbers());
    }
    
    @Test
    public void amountOfNumbers_zeroToOne_zeroToOne_happyPath(){
        numberStatistics = new NumberStatistics(); 
        int amountOfNumbers = 1; 
        
        numberStatistics.addNumber(1);
        
        assertEquals(amountOfNumbers, numberStatistics.amountOfNumbers());
    }
    
    @Test
    public void sum_two_two_happyPath(){
        numberStatistics = new NumberStatistics(); 
        int expectedSum = 2; 
        
        numberStatistics.addNumber(1);
        numberStatistics.addNumber(1);
        int actualSum = numberStatistics.sum(); 
        
        assertEquals(expectedSum, actualSum);
       
    }
    
    @Test
    public void sum_three_three_happyPath(){
        numberStatistics = new NumberStatistics(); 
        int expectedSum = 3; 
        
        numberStatistics.addNumber(1); 
        numberStatistics.addNumber(2); 
        int actualSum = numberStatistics.sum(); 
        
        assertEquals(expectedSum, actualSum);
       
    }
    
    @Test
    public void sum_oneHundred_oneHundred_happyPath(){
        numberStatistics = new NumberStatistics(); 
        int expectedSum = 100; 
        
        numberStatistics.addNumber(25); 
        numberStatistics.addNumber(25); 
        numberStatistics.addNumber(25); 
        numberStatistics.addNumber(25); 
        
        int actualSum = numberStatistics.sum(); 
        
        assertEquals(expectedSum, actualSum);
       
    }
    
    @Test
    public void sum_zero_zero_returnZero(){
        numberStatistics = new NumberStatistics(); 
        int expectedSum = 0; 
        
        int actualSum = numberStatistics.sum(); 
        
        assertEquals(expectedSum, actualSum);
    }
    
    @Test
    public void average_three_three_happyPath(){
        numberStatistics = new NumberStatistics(); 
        double expectedAverage = 3; 
        
        numberStatistics.addNumber(3); 
        numberStatistics.addNumber(3); 
        numberStatistics.addNumber(3); 
        
        double actualAverage = numberStatistics.average(); 
        
        assertEquals(expectedAverage, actualAverage, 0.1);
       
    }
    
    @Test
    public void average_five_five_happyPath(){
        numberStatistics = new NumberStatistics(); 
        double expectedAverage = 5; 
        
        numberStatistics.addNumber(5); 
        numberStatistics.addNumber(5); 
        numberStatistics.addNumber(5); 
        
        double actualAverage = numberStatistics.average(); 
        
        assertEquals(expectedAverage, actualAverage, 0.1);
       
    }
    
    @Test
    public void average_zero_zero_divideByZero(){
        numberStatistics = new NumberStatistics(); 
        double expectedAverage = 0; 
        

        
        double actualAverage = numberStatistics.average(); 
        
        assertEquals(expectedAverage, actualAverage, 0.1);
       
    }
    
    
    
    
    
}

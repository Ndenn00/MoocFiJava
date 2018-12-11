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
public class BoundedCounterTest {
    
    BoundedCounter boundedCounter; 
   
    
    @Before
    public void setUp() {
      
    }

    @Test
    public void next_fromZeroToOne_one_happyPath() {
        //assemble
        boundedCounter =  new BoundedCounter(10); 
        int counterValue = 1;      
        
        //act 
        boundedCounter.next();
        
        //assert   
        assertEquals(counterValue, boundedCounter.getValue());
    }
    
    @Test
    public void next_fromEightToNine_nine_happyPath(){
        //assemble
        boundedCounter =  new BoundedCounter(10);
        boundedCounter.setValue(8);
        int counterValue = 9;   
        
        //act 
        boundedCounter.next();
        
        //assert   
        assertEquals(counterValue, boundedCounter.getValue()); 
    }
    
    @Test
    public void next_fromTenToZero_Zero_errorPath(){
        //assemble
        boundedCounter =  new BoundedCounter(10);
        boundedCounter.setValue(10);
        int counterValue = 0;   
        
        //act 
        boundedCounter.next();
        
        //assert   
        assertEquals(counterValue, boundedCounter.getValue()); 
    }
    
    @Test 
        public void setValue_minusOneToZero_zero_happyPath(){
        //assemble 
        boundedCounter =  new BoundedCounter(10);
        int counterValue = 0; 
        
        //act
        boundedCounter.setValue(-1);
        
        //assert
        assertEquals(boundedCounter.getValue(), counterValue);
    }
        
        
        @Test 
        public void setValue_elevenToZero_zero_happyPath(){
        
        boundedCounter =  new BoundedCounter(10);
        int counterValue = 0; 
        
        
        boundedCounter.setValue(11);
        
        
        assertEquals(boundedCounter.getValue(), counterValue);
    }
    
}

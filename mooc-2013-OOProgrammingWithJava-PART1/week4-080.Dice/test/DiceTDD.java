/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author niald
 */
public class DiceTDD {

    Dice dice;
    ArrayList<Integer> arrayList1;
    ArrayList<Integer> arrayList2;

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void roll_greaterThanZero_greaterThanZero_happyPath() {
        
        dice = new Dice(6); 
        boolean isGreaterThanZero = true; 
        
        
        for(int i = 0; i < 100; i++){
            if(dice.roll() == 0){
                isGreaterThanZero = false; 
                break; 
            }
        }
        
        

        assertEquals(isGreaterThanZero, true);
    }
    
    @Test
    public void roll_randomInteger_randomInteger_happyPath() {
        
        int qtyOfSides = 6; 
        dice = new Dice(qtyOfSides); 
        arrayList1 = new ArrayList<Integer>(); 
        arrayList2 = new ArrayList<Integer>(); 
        
        for(int i = 0; i < 100; i++){
            arrayList1.add(dice.roll()); 
        }
        for(int i = 0; i < 100; i++){
            arrayList2.add(dice.roll()); 
        }
        
        assertNotEquals(arrayList1, arrayList2);
        
    }
    
    @Test
    public void roll_lessThanMaxSides_lessThanMaxSides_happyPath() {
        
        int qtyOfSides = 6; 
        dice = new Dice(qtyOfSides); 
        arrayList1 = new ArrayList<Integer>(); 
        boolean diceRollGreaterThanNumberOfSides = false; 
        
        for(int i = 0; i < 100; i++){
            arrayList1.add(dice.roll()); 
        }
        for(int i = 0; i < 100; i++){
            if(arrayList1.get(i) > qtyOfSides){
                diceRollGreaterThanNumberOfSides = true; 
            }
        }
        
        assertEquals(diceRollGreaterThanNumberOfSides, false);
        
    }
    
    
}

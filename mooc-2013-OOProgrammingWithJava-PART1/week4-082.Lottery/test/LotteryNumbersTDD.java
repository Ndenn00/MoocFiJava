/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author niald
 */
public class LotteryNumbersTDD {

    LotteryNumbers lotteryNumbers;
    ArrayList<Integer> arrayList1;
    ArrayList<Integer> arrayList2; 
    Set<Integer> set;

    private final int MINIMUM = 1;
    private final int MAXIMUM = 39;

    /*
    Added in error 
    Cannot be used as test cases as these could be completely invalidated when introducing random
    Must use non specific numbers
    */
    @Test @Ignore
    public void containsNumber_one_one_shouldBeTrue() {

        int numberToBeSearched = 1;
        lotteryNumbers = new LotteryNumbers();
        lotteryNumbers.addNumber(numberToBeSearched);

        boolean actualContain = lotteryNumbers.containsNumber(numberToBeSearched);

        assertEquals(true, actualContain);

    }

    @Test @Ignore
    public void containsNumber_two_two_shouldBefalse() {

        int numberToBeSearched = 2;
        int numberToBeAdded = 1;
        lotteryNumbers = new LotteryNumbers();
        lotteryNumbers.addNumber(numberToBeAdded);

        boolean actualContain = lotteryNumbers.containsNumber(numberToBeSearched);

        assertEquals(false, actualContain);

    }
     
    @Test
    public void containsNumber_numberWithinRange_() {

        lotteryNumbers = new LotteryNumbers();
        boolean containsInLottery =  false;   
        
        for (int i : lotteryNumbers.numbers()) {
            if(i >= MINIMUM && i< MAXIMUM){
                containsInLottery = true; 
            }
        }
        
        assertEquals(true, containsInLottery);

    }

    @Test
    public void drawNumbers_notEmptyList_notEmptyList() {
        lotteryNumbers = new LotteryNumbers();

        lotteryNumbers.drawNumbers();

        assertNotEquals(lotteryNumbers.numbers().size(), 0);
    }

    @Test
    public void drawNumbers_listOfSeven_listOfSeven() {
        int qtyOfNumbersInList = 7;

        lotteryNumbers = new LotteryNumbers();

        lotteryNumbers.drawNumbers();

        assertEquals(lotteryNumbers.numbers().size(), qtyOfNumbersInList);
    }

    @Test
    public void drawNumbers_noDuplicates_noDuplicates() {

        lotteryNumbers = new LotteryNumbers();
        lotteryNumbers.drawNumbers();

        arrayList1 = new ArrayList<Integer>(lotteryNumbers.numbers());
        set = new HashSet<Integer>(arrayList1);

        assertEquals(arrayList1.size(), set.size());
    }
    
    @Test
    public void drawNumbers_ensureRandom_ensureRandom(){
        
        lotteryNumbers = new LotteryNumbers(); 
        
        lotteryNumbers.drawNumbers();
        arrayList1= lotteryNumbers.numbers(); 
        
        lotteryNumbers = new LotteryNumbers(); 
        
        lotteryNumbers.drawNumbers();
        arrayList2 = lotteryNumbers.numbers(); 
        
        assertNotEquals(arrayList1, arrayList2);
    }

}

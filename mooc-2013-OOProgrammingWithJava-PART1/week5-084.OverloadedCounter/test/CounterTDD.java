/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author niald
 */
public class CounterTDD {

    Counter counter;

    @Before
    public void before() {

    }

    @Test
    public void counterDefaultConstructor_instantiatesWithStartingValueZero() {

        int expected = 0;

        counter = new Counter();

        assertEquals(counter.value(), expected);
    }

    @Test
    public void counterDefaultConstructor_instantiatesWithCheckFalse() {
        boolean expected = false;

        counter = new Counter();

        assertEquals(counter.getCheck(), expected);
    }

    @Test
    public void counterCheckConstructor_instantiatesWithCheckAsParameterFalse() {
        boolean expected = false;

        counter = new Counter(false);

        assertEquals(counter.getCheck(), expected);
    }

    @Test
    public void counterCheckConstructor_instantiatesWithCheckAsParameterTrue() {
        boolean expected = true;

        counter = new Counter(true);

        assertEquals(counter.getCheck(), expected);
    }

    @Test
    public void counterCheckConstructor_instantiatesWithStartingValueZero() {
        int expected = 0;

        counter = new Counter(true);

        assertEquals(counter.value(), expected);
    }

    @Test
    public void counterValueCheckConstructor_instantiatesWithStartingValueZero() {
        int expected = 0;

        counter = new Counter(0, false);

        assertEquals(counter.value(), expected);
    }

    @Test
    public void counterValueCheckConstructor_instantiatesWithStartingValueOne() {
        int expected = 1;

        counter = new Counter(1, false);

        assertEquals(counter.value(), expected);
    }

    @Test
    public void counterValueCheckConstructor_instantiatesWithCheckTrue() {
        boolean expected = true;

        counter = new Counter(0, true);

        assertEquals(counter.getCheck(), expected);
    }

    @Test
    public void counterValueCheckConstructor_instantiatesWithCheckFalse() {
        boolean expected = false;

        counter = new Counter(0, false);

        assertEquals(counter.getCheck(), expected);
    }

    @Test
    public void increase_increasesAZeroCounterToOne() {
        int expected = 1;

        counter = new Counter();

        counter.increase();

        assertEquals(expected, counter.value());

    }

    @Test
    public void decrease_decreaseCounterFromOneToZero() {
        int expected = 0;

        counter = new Counter(1, true);

        counter.decrease();

        assertEquals(expected, counter.value());

    }

    @Test
    public void decrease_cannotDecreasebelowZeroWhenCheckIsTrue() {
        int expected = 0;

        counter = new Counter(1, true);
        counter.decrease();
        counter.decrease();

        assertEquals(expected, counter.value());
    }

    @Test
    public void decrease_canDecreasebelowZeroWhenCheckIsFalse() {
        int expected = -1;

        counter = new Counter(1, false);
        counter.decrease();
        counter.decrease();

        assertEquals(expected, counter.value());
    }
    
    @Test
    public void increase_increaseWithParamFromFourToFive() {
        int expected = 5;

        counter = new Counter(4, false);

        counter.increase(1);

        assertEquals(expected, counter.value());
    }
    
    @Test
    public void increase_increaseWithParamFromFiveToTen() {
        int expected = 10;

        counter = new Counter(5, false);

        counter.increase(5);

        assertEquals(expected, counter.value());
    }
    
    @Test
    public void decrease_decreaseWithParamFromFiveToFour() {
        int expected = 4;

        counter = new Counter(5, false);

        counter.decrease(1);

        assertEquals(expected, counter.value());
    }
    
    @Test
    public void decrease_decreaseWithPAramFromTenToFive() {
        int expected = 5;

        counter = new Counter(10, false);

        counter.decrease(5);

        assertEquals(expected, counter.value());
    }
    
    @Test
    public void counterValueConstructor_(){
        int expected = 5; 
        
        counter = new Counter(5); 
        
        assertEquals(expected, counter.value());
    }

}

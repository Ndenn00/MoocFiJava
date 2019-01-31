/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author niald
 */
public class ReformatoryTestTDD {

    Reformatory reformatory;
    Person person;

    @Test
    public void weight_weightOfOne() {
        person = new Person("test", 1, 1, 1);
        reformatory = new Reformatory();

        int expected = person.getWeight();

        int actual = reformatory.weight(person);

        assertEquals(expected, actual);
    }

    @Test
    public void weight_weightOfTwo() {
        person = new Person("test", 2, 2, 2);
        reformatory = new Reformatory();

        int expected = person.getWeight();

        int actual = reformatory.weight(person);

        assertEquals(expected, actual);
    }

    @Test
    public void feed_increaseWeightOfPersonFromOneToTwo() {
        person = new Person("test", 1, 1, 1);
        reformatory = new Reformatory();
        int expected = 2;

        reformatory.feed(person);
        int actual = reformatory.weight(person);

        assertEquals(expected, actual);

    }

    @Test
    public void feed_increaseWeightOfPersonFromTwoToFive() {
        person = new Person("test", 2, 2, 2);
        reformatory = new Reformatory();
        int expected = 5;

        reformatory.feed(person);
        reformatory.feed(person);
        reformatory.feed(person);
        int actual = reformatory.weight(person);

        assertEquals(expected, actual);

    }
    
    @Test
    public void totalWeightsMeasured_calledOnce(){
        person = new Person("test", 1, 1, 1);
        reformatory = new Reformatory();
        int expected = 1;
        
        reformatory.weight(person); 
        int actual = reformatory.totalWeightsMeasured(); 
        
        assertEquals(expected, actual);   
    }
    
    @Test
    public void totalWeightsMeasured_calledTwice(){
        person = new Person("test", 1, 1, 1);
        reformatory = new Reformatory();
        int expected = 2;
        
        reformatory.weight(person); 
        reformatory.weight(person); 
        int actual = reformatory.totalWeightsMeasured(); 
        
        assertEquals(expected, actual);   
    }

}

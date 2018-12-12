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
 *
 * @author niald
 */
public class PasswordRandomizerTDD {

    PasswordRandomizer passwordRandomizer;
    ArrayList<String> arrayList;

    @Test
    public void passWordRandomizerConstructor_lengthOne_lengthOne() {

        passwordRandomizer = new PasswordRandomizer(1);

        int expectedLength = 1;

        assertEquals(passwordRandomizer.getLength(), expectedLength);

    }

    @Test
    public void passWordRandomizerConstructor_lengthTwo_lengthTwo() {

        passwordRandomizer = new PasswordRandomizer(2);

        int expectedLength = 2;

        int actualLegnth = passwordRandomizer.getLength();

        assertEquals(expectedLength, actualLegnth);

    }

    @Test
    public void passWordRandomizerConstructor_lengthZero_lengthOne_errorPath() {

        passwordRandomizer = new PasswordRandomizer(0);

        int expectedLength = 1;

        int actualLegnth = passwordRandomizer.getLength();

        assertEquals(expectedLength, actualLegnth);

    }

//    @Test
//    public void createPassword_notEqual_notEqual(){
//        
//        passwordRandomizer = new PasswordRandomizer(5); 
//        arrayList = new ArrayList<String>(); 
//        
//        arrayList.add(passwordRandomizer.createPassword()); 
//        arrayList.add(passwordRandomizer.createPassword()); 
//        
//        assertNotEquals(arrayList.get(0), arrayList.get(1));
//                
//    }
    @Test
    public void createPassword_lengthOne_lengthOne() {

        int expectedLengthOfWord = 1;

        passwordRandomizer = new PasswordRandomizer(expectedLengthOfWord);

        int actualLengthOfWord = passwordRandomizer.createPassword().length();

        assertEquals(expectedLengthOfWord, actualLengthOfWord);
    }

    @Test
    public void createPassword_lengthFive_lengthFive() {

        int expectedLengthOfWord = 5;

        passwordRandomizer = new PasswordRandomizer(expectedLengthOfWord);

        int actualLengthOfWord = passwordRandomizer.createPassword().length();

        assertEquals(expectedLengthOfWord, actualLengthOfWord);
    }

    @Test
    public void createPassword_lengthTen_lengthTen() {

        int expectedLengthOfWord = 10;

        passwordRandomizer = new PasswordRandomizer(expectedLengthOfWord);

        int actualLengthOfWord = passwordRandomizer.createPassword().length();

        assertEquals(expectedLengthOfWord, actualLengthOfWord);
    }

    @Test
    public void createPassword_containsB_containsB() {

        passwordRandomizer = new PasswordRandomizer(100);
        boolean containsTheCorrectChar = false;
        String returnedPassword = passwordRandomizer.createPassword();

        int indexOfCorrectChar = returnedPassword.indexOf("b");
        if (indexOfCorrectChar >= 0) {
            containsTheCorrectChar = true;
        }
        assertEquals(true, containsTheCorrectChar);
    }

    @Test
    public void createPassword_containsZ_containsZ() {

        passwordRandomizer = new PasswordRandomizer(100);
        boolean containsTheCorrectChar = false;
        String returnedPassword = passwordRandomizer.createPassword();

        int indexOfCorrectChar = returnedPassword.indexOf("z");
        if (indexOfCorrectChar >= 0) {
            containsTheCorrectChar = true;
        }
        assertEquals(true, containsTheCorrectChar);
    }

    @Test
    public void createPassword_lengthZero_lengthOne_errorPath() {

        int expectedLengthOfWord = 0;
        int realLengthOfWord = 1;

        passwordRandomizer = new PasswordRandomizer(expectedLengthOfWord);

        int actualLengthOfWord = passwordRandomizer.createPassword().length();

        assertEquals(realLengthOfWord, actualLengthOfWord);
    }

    @Test
    public void createPassword_testRandom_testRandom() {

        ArrayList<String> arraylist1 = new ArrayList<String>();
        ArrayList<String> arraylist2 = new ArrayList<String>();
        passwordRandomizer = new PasswordRandomizer(10);

        for (int i = 0; i < 200; i++) {
            arraylist1.add(passwordRandomizer.createPassword());
        }
        for (int i = 0; i < 200; i++) {

            arraylist2.add(passwordRandomizer.createPassword());
        }
        
        assertNotEquals(arraylist1, arraylist2);
    }

}

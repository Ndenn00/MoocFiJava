/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author niald
 */
public class HangmanLogicTDD {

    HangmanLogic hangmanLogic;

    public HangmanLogicTDD() {
    }

    @Test
    public void guessLetter_incrementGuessAttemptsToOne_() {
        hangmanLogic = new HangmanLogic("any");
        hangmanLogic.guessLetter("a");
        int expectedGuessAttempts = 1;
        int actualGuessAttempts = hangmanLogic.guessedLetters().length();

        assertEquals(expectedGuessAttempts, actualGuessAttempts);

    }

    @Test
    public void guessLetter_incrementGuessAttemptsToTwo_() {
        hangmanLogic = new HangmanLogic("any");
        hangmanLogic.guessLetter("a");
        hangmanLogic.guessLetter("n");
        int expectedGuessAttempts = 2;
        int actualGuessAttempts = hangmanLogic.guessedLetters().length();

        assertEquals(expectedGuessAttempts, actualGuessAttempts);

    }

    @Test
    public void guessLetter_incrementGuessAttemptToTwo_checkIfContainingLetterDoesNotIncreaseGuessedLetters() {
        hangmanLogic = new HangmanLogic("any");
        hangmanLogic.guessLetter("a");
        hangmanLogic.guessLetter("n");
        hangmanLogic.guessLetter("n");
        int expectedGuessAttempts = 2;

        int actualGuessAttempts = hangmanLogic.guessedLetters().length();

        assertEquals(expectedGuessAttempts, actualGuessAttempts);
    }

    @Test
    public void guessLetter_incrementNumberOfFaultsToOne_() {
        hangmanLogic = new HangmanLogic("any");
        hangmanLogic.guessLetter("a");
        hangmanLogic.guessLetter("b");
        int expectedNumberOfFaults = 1;

        int actualNumberOfFaults = hangmanLogic.numberOfFaults();

        assertEquals(expectedNumberOfFaults, actualNumberOfFaults);

    }
    
    @Test
    public void guessLetter_incrementNumberOfFaultsToTwo_() {
        hangmanLogic = new HangmanLogic("any");
        hangmanLogic.guessLetter("a");
        hangmanLogic.guessLetter("b");
        hangmanLogic.guessLetter("c");
        int expectedNumberOfFaults = 2;

        int actualNumberOfFaults = hangmanLogic.numberOfFaults();

        assertEquals(expectedNumberOfFaults, actualNumberOfFaults);

    }
    
    @Test
    public void hiddenWord_noGuessesAllBlankFourChars(){
        
        hangmanLogic = new HangmanLogic("test"); 
        
        String expected = "____"; 
        
        // no action 
        
        assertEquals(expected, hangmanLogic.hiddenWord());
    }
    
    @Test
    public void hiddenWord_noGuessesAllBlankFiveChars(){
        
        hangmanLogic = new HangmanLogic("testy"); 
        
        String expected = "_____"; 
        
       String actual = hangmanLogic.hiddenWord(); 
        
        assertEquals(expected, actual);
    }

    @Test
    public void hiddenWord_guessFirstChar(){
        
        hangmanLogic = new HangmanLogic("test"); 
        hangmanLogic.guessLetter("t");
        
        String expected = "T___"; 
        
        String actual = hangmanLogic.hiddenWord(); 
        
        // no action 
        
        assertEquals(expected, actual);
    }
}

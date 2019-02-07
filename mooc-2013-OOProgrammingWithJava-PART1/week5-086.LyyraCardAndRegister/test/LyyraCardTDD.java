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
public class LyyraCardTDD {
    
    LyyraCard lyyraCard; 
    
    @Test
    public void pay_balance100pay50ReturnTrue(){
        lyyraCard = new LyyraCard(100); 
        
        assertTrue(lyyraCard.pay(50));
    }
    
    @Test
    public void pay_balance100pay100ReturnTrue(){
        lyyraCard = new LyyraCard(100); 
        
        assertTrue(lyyraCard.pay(100));
    }
    
    @Test
    public void pay_balance100pay101ReturnFalse(){
        lyyraCard = new LyyraCard(100); 
        
        assertFalse(lyyraCard.pay(101));
    }
    
    @Test
    public void pay_balance100pay10ReducesBalanceTo90(){
        lyyraCard = new LyyraCard(100); 
        double expected = 90; 
        
        lyyraCard.pay(10); 
        
        assertEquals(expected, lyyraCard.balance(), 0);
        
        
    }
    
    @Test
    public void pay_balance100pay50ReducesBalanceTo50(){
        lyyraCard = new LyyraCard(100); 
        double expected = 50; 
        
        lyyraCard.pay(50); 
        
        assertEquals(expected, lyyraCard.balance(), 0);
        
    }
    
    
    @Test
    public void pay_balance100pay100ReducesBalanceToZero_boundaryCheck(){
        lyyraCard = new LyyraCard(100); 
        double expected = 0; 
        
        lyyraCard.pay(100); 
        
        assertEquals(expected, lyyraCard.balance(), 0);
        
    }
    
    @Test
    public void pay_balance100pay101ReducesBalanceToZero_doesNotPayOverBalance(){
        lyyraCard = new LyyraCard(100); 
        double expected = 100; 
        
        lyyraCard.pay(101); 
        
        assertEquals(expected, lyyraCard.balance(), 0);
        
    }
    
    
    
    
}

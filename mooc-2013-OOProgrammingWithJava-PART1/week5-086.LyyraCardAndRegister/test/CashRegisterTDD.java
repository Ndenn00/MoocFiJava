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
public class CashRegisterTDD {

    
    CashRegister cashRegister;
    LyyraCard lyyraCard;

    @Test
    public void constructor_constructorBeginsWithOneThousandFloat() {

        double expected = 1000;
        cashRegister = new CashRegister();

        assertEquals(cashRegister.getCashInRegister(), expected, 0);
    }

    @Test
    public void economicalSold_increasesQtySoldFromZeroToOne() {
        cashRegister = new CashRegister();
        int expected = 1;

        cashRegister.payEconomical(2.5);

        assertEquals(expected, cashRegister.getEconomicalSold());

    }

    @Test
    public void economicalSold_soldQtyDoesNotIncreaseWhenPaymentLessThanEconomicalPrice() {
        cashRegister = new CashRegister();
        int expected = 0;

        cashRegister.payEconomical(1);

        assertEquals(expected, cashRegister.getEconomicalSold());

    }

    @Test
    public void economicalSold_soldQtyDoesNotIncreaseWhenPaymentLessThanEconomicalPrice_boundaryTest() {
        cashRegister = new CashRegister();
        int expected = 0;

        cashRegister.payEconomical(2.49);

        assertEquals(expected, cashRegister.getEconomicalSold());

    }

    @Test
    public void economicalSold_increasesQtySoldMultipleTimes() {
        cashRegister = new CashRegister();
        int expected = 3;

        cashRegister.payEconomical(2.5);
        cashRegister.payEconomical(2.5);
        cashRegister.payEconomical(2.5);

        assertEquals(expected, cashRegister.getEconomicalSold());

    }

    @Test
    public void economicalSold_payTwoFiftyThenCashRegBalanceIncreasesByTwoFifty() {
        cashRegister = new CashRegister();
        double payment = 2.50;
        double expected = 1002.5;

        cashRegister.payEconomical(payment);

        assertEquals(expected, cashRegister.getCashInRegister(), 0);
    }

    @Test
    public void economicalSold_payTwoFiftyTwiceThenCashRegBalanceIncreasesByFive() {
        cashRegister = new CashRegister();
        double payment = 2.50;
        double expected = 1005;

        cashRegister.payEconomical(payment);
        cashRegister.payEconomical(payment);

        assertEquals(expected, cashRegister.getCashInRegister(), 0);
    }

    @Test
    public void economicalSold_paymentIsLessThanLunchThenNoChangeInBalance() {
        cashRegister = new CashRegister();
        double payment = 2.00;
        double expected = 1000;

        cashRegister.payEconomical(payment);

        assertEquals(expected, cashRegister.getCashInRegister(), 0);
    }

    @Test
    public void economicalSold_changeOfOneEuroReturnedAfterThreeFiftyPaid() {
        cashRegister = new CashRegister();
        double payment = 3.50;
        double expected = 1;

        double actual = cashRegister.payEconomical(payment);

        assertEquals(expected, actual, 0);
    }

    @Test
    public void economicalSold_changeOfTwoEurosReturnedAfterFourFiftyPaid() {
        cashRegister = new CashRegister();
        double payment = 4.50;
        double expected = 2;

        double actual = cashRegister.payEconomical(payment);

        assertEquals(expected, actual, 0);
    }

    @Test
    public void economicalSold_allPaymentReturnedWhenPaymentLessThanPrice() {
        cashRegister = new CashRegister();
        double payment = 2;
        double expected = 2;

        double actual = cashRegister.payEconomical(payment);

        assertEquals(expected, actual, 0);
    }

    @Test
    public void economicalSold_noChangeInCashRegBalanceWhenPaymentLessThanPrice() {
        cashRegister = new CashRegister();
        double payment = 2;
        double expected = 1000;

        cashRegister.payEconomical(payment);
        double actual = cashRegister.getCashInRegister();

        assertEquals(expected, actual, 0);
    }
    
    // Gourmet implementation exactly the same as economical, skip tests

    @Test
    public void economicalSoldLyyraCard_CardBalanceIsGreaterThanLunchPriceReturnTrue() {
        cashRegister = new CashRegister();
        lyyraCard = new LyyraCard(3); 
        
        
        boolean actual = cashRegister.payEconomical(lyyraCard);
        
        assertTrue(actual);
    }
    
    @Test
    public void economicalSoldLyyraCard_CardBalanceIsLessThanLunchPriceReturnFalse() {
        cashRegister = new CashRegister();
        lyyraCard = new LyyraCard(2); 
        
        
        boolean actual = cashRegister.payEconomical(lyyraCard);
        
        assertFalse(actual);
    }
    
    @Test
    public void economicalSoldLyyraCard_increaseQtySoldEconomicalLunchesFromZeroToOne() {
        cashRegister = new CashRegister();
        lyyraCard = new LyyraCard(5); 
        int expected = 1;
     
        cashRegister.payEconomical(lyyraCard);
        int actual = cashRegister.getEconomicalSold(); 
        
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void economicalSoldLyyraCard_increaseQtySoldEconomicalLunchesFromZeroToThree() {
        cashRegister = new CashRegister();
        lyyraCard = new LyyraCard(15); 
        int expected = 3;
     
        cashRegister.payEconomical(lyyraCard);
        cashRegister.payEconomical(lyyraCard);
        cashRegister.payEconomical(lyyraCard);
        int actual = cashRegister.getEconomicalSold(); 
        
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void economicalSoldLyyraCard_reduceBalanceOfCardByPaymentAmount() {
        cashRegister = new CashRegister();
        lyyraCard = new LyyraCard(5); 
        double expected = 2.50;
     
        cashRegister.payEconomical(lyyraCard);
        
        double actual = lyyraCard.balance(); 
        
        
        assertEquals(expected, actual, 0);
    }
    
    
    
    // Gourmet implementation exactly the same as economical, skip tests
    
    
    @Test
    public void loadMoneyToCard_increaseCardBalanceFromTenToTwenty(){
        cashRegister = new CashRegister();
        lyyraCard = new LyyraCard(10); 
        double payment = 10; 
        double expected = 20;
        
        cashRegister.loadMoneyToCard(lyyraCard, payment);
        
        double actual = lyyraCard.balance(); 
        
        assertEquals(expected, actual, 0);
        
    }
    
    @Test
    public void loadMoneyToCard_increaseCardBalanceFromTenToFifty(){
        cashRegister = new CashRegister();
        lyyraCard = new LyyraCard(10); 
        double payment = 40; 
        double expected = 50;
        
        cashRegister.loadMoneyToCard(lyyraCard, payment);
        
        double actual = lyyraCard.balance(); 
        
        assertEquals(expected, actual, 0);
        
    }
    
    @Test
    public void loadMoneyToCard_increasesCashRegisterBalanceFromOneThousandFloatToOneThousandTen(){
        cashRegister = new CashRegister();
        lyyraCard = new LyyraCard(10); 
        double payment = 10; 
        double expected = 1010;
        
        cashRegister.loadMoneyToCard(lyyraCard, payment);
        
        double actual = cashRegister.getCashInRegister(); 
        
        assertEquals(expected, actual, 0);
        
    }
    
    @Test
    public void loadMoneyToCard_minusPaymentHasNoEffectOnCashRegister_guard(){
        cashRegister = new CashRegister();
        lyyraCard = new LyyraCard(10); 
        double payment = -10; 
        double expected = 1000;
        
        cashRegister.loadMoneyToCard(lyyraCard, payment);
        
        double actual = cashRegister.getCashInRegister(); 
        
        assertEquals(expected, actual, 0);
        
    }
    
    
    @Test
    public void loadMoneyToCard_negativeSumHasNoEffectOnCardBalance(){
        cashRegister = new CashRegister();
        lyyraCard = new LyyraCard(10); 
        double payment = -10; 
        double expected = 10;
        
        cashRegister.loadMoneyToCard(lyyraCard, payment);
        
        double actual = lyyraCard.balance(); 
        
        assertEquals(expected, actual, 0);
        
    }
    
}

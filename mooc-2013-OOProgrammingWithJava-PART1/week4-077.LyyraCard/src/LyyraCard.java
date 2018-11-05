/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author niald
 */
public class LyyraCard {

    private double balance;
    private final double ECONOMICAL_MEAL = 2.50;
    private final double GOURMET_MEAL = 4.0;
    private final double MAX_BALANCE = 150.0;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public String toString() {
        return "The card has " + this.balance + " euros";
    }

    public void payEconomical() {
        if (this.balance - ECONOMICAL_MEAL >= 0) {
            this.balance -= ECONOMICAL_MEAL;
        }
    }

    public void payGourmet() {
        if (this.balance - GOURMET_MEAL >= 0) {
            this.balance -= GOURMET_MEAL;
        }
    }

    public void loadMoney(double amount) {
        if (amount > 0 && (amount + this.balance <= MAX_BALANCE)) {
            this.balance += amount;
        } else if(amount > 0 && (amount + this.balance >= MAX_BALANCE)) {
            this.balance = MAX_BALANCE;
        }
    }
}

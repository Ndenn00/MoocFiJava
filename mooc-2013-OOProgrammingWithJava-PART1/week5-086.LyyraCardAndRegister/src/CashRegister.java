
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    private final double ECONOMICAL_LUNCH = 2.50;
    private final double GOURMET_LUNCH = 4.00;
    private final double FLOAT = 1000.00;

    public CashRegister() {
        this.cashInRegister = FLOAT;
    }

    public double payEconomical(double cashGiven) {

        if (cashGiven >= ECONOMICAL_LUNCH) {
            this.cashInRegister += ECONOMICAL_LUNCH;
            this.economicalSold++;
            return cashGiven - ECONOMICAL_LUNCH;
        }
        return cashGiven;
    }

    public double payGourmet(double cashGiven) {
        if (cashGiven >= GOURMET_LUNCH) {
            this.cashInRegister += GOURMET_LUNCH;
            this.gourmetSold++;
            return cashGiven - GOURMET_LUNCH;
        }
        return cashGiven;
    }

    public boolean payEconomical(LyyraCard lyyraCard) {

        if (lyyraCard.balance() >= ECONOMICAL_LUNCH) {
            this.economicalSold++;
            lyyraCard.pay(ECONOMICAL_LUNCH); 
            return true;
        }
        return false;
    }

    public boolean payGourmet(LyyraCard lyyraCard) {

        if (lyyraCard.balance() >= GOURMET_LUNCH) {
            this.gourmetSold++;
            lyyraCard.pay(GOURMET_LUNCH); 
            return true;
        }
        return false;
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if(sum >= 0){
            card.loadMoney(sum);
            this.cashInRegister += sum;   
        }
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }

    public double getCashInRegister() {
        return this.cashInRegister;
    }

    public int getEconomicalSold() {
        return economicalSold;
    }

    public int getGourmetSold() {
        return gourmetSold;
    }

}

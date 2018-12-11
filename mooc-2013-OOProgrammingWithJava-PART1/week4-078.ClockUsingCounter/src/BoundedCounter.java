/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author niald
 */
public class BoundedCounter {

    private int value;
    private int upperLimit;
    private final int LOWER_LIMIT = 0;

    public BoundedCounter(int upperLimit) {
        this.value = LOWER_LIMIT;
        this.upperLimit = upperLimit;
    }

    public void next() {
        if (this.value == this.upperLimit) {
            this.value = LOWER_LIMIT;
        } else {
            this.value++;
        }
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        if (value >= LOWER_LIMIT && value <= this.upperLimit) {
            this.value = value;
        } else {
            this.value = LOWER_LIMIT;
        }
    }

    public String toString() {
        if (this.value < 10) {
            return "0" + this.value;
        }
        return "" + this.value;
    }
}

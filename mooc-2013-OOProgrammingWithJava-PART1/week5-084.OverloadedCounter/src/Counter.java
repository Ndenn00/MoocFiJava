/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author niald
 */
public class Counter {

    private boolean check;
    private int value;

    public Counter() {

    }

    public Counter(boolean check) {
        this.check = check;

    }

    public Counter(int startingValue){
        this.value = startingValue; 
    }
    
    public Counter(int startingValue, boolean check) {
        this.value = startingValue;
        this.check = check;

    }
    

    public int value() {
        return this.value;
    }

    public boolean getCheck() {
        return this.check;
    }

    public void increase() {
        this.value++;
    }

    public void decrease() {
        if (this.check) {
            if (this.value > 0) {
                this.value--;
            }
        } else {
            this.value--;
        }

    }
    
    public void increase(int number) {
        for(int i = 0; i < number; i++){
            increase();
        }
    }
    
    public void decrease(int number){
         for(int i = 0; i < number; i++){
            decrease();
        }
    }

}

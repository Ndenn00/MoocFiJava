/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author niald
 */
public class Product {

    private String nameAtSart;
    private double priceAtStart;
    private int amountAtStart;

    public Product(String nameAtSart, double priceAtStart, int amountAtStart) {
        this.nameAtSart = nameAtSart;
        this.priceAtStart = priceAtStart;
        this.amountAtStart = amountAtStart;
    }

    public void printProduct() {
        System.out.println(this.nameAtSart + ", price "+this.priceAtStart +
                ", amount" + this.amountAtStart);
    }
}

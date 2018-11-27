package com.example.brandon.register;

/**
 * Created by Brandon on 7/12/2017.
 */

public class Item {
    private String name;
    private Double price;

    public Item (String n, Double p) {
        this.name = n;
        this.price = p;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return this.name + "      " + this.price;
    }
}

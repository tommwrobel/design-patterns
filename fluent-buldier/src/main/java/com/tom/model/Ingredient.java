package com.tom.model;

public enum Ingredient {
    DOUGH(6.0f),
    TOMATO_SOUCE(2.0f),
    MOZARELLA_CHEESE(2.0f),
    SALAMI(3.0f),
    PEPPERONI(3.0f),
    PINEAPPLE(2.0f),
    ONION(1.0f),
    HAM(3.0f),
    CHICKEN(3.0f),
    PEPPER(1.0f),
    OLIVES(1.0f);

    private float price;
    Ingredient(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }
}

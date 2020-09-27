package com.tom.model;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private float price;
    private List<Ingredient> ingredients;

    private Pizza(Buldier pizzaBuldier) {
        this.price = pizzaBuldier.price;
        this.ingredients = pizzaBuldier.ingredients;
    }

    public float getPrice() {
        return price;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public static class Buldier {
        private float price;
        private List<Ingredient> ingredients;

        public Buldier() {
            price = 0.0f;
            ingredients = new ArrayList<Ingredient>();
            ingredients.add(Ingredient.DOUGH);
            price += Ingredient.DOUGH.getPrice();
        }

        public Buldier addIngriedient(Ingredient ingredient) {
            ingredients.add(ingredient);
            price += ingredient.getPrice();
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

}

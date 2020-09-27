package com.tom;

import com.tom.model.Ingredient;
import com.tom.model.Pizza;

public class FluentBuldier {

    public static void main(String[] args) {

        Pizza myPizza = new Pizza.Buldier()
                .addIngriedient(Ingredient.TOMATO_SOUCE)
                .addIngriedient(Ingredient.MOZARELLA_CHEESE)
                .addIngriedient(Ingredient.OLIVES)
                .addIngriedient(Ingredient.PEPPERONI)
                .build();

        System.out.println(myPizza.getIngredients());

    }
}

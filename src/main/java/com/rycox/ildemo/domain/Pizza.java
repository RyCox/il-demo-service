package com.rycox.ildemo.domain;

import java.util.Arrays;
import java.util.List;

public class Pizza {
    private List<String> ingredientList;

    public Pizza() {
        ingredientList = Arrays.asList("Cheese", "Pepperoni", "Mushroom");
    }

    public Pizza(List<String> ingredients) {
        ingredientList = ingredients;
    }

    public List<String> getIngredientList() {
        return ingredientList;
    }
}

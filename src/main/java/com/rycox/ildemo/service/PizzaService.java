package com.rycox.ildemo.service;

import com.rycox.ildemo.domain.Pizza;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PizzaService {

    public Pizza createNewPizza(List<String> ingredients) {
        return new Pizza(ingredients);
    }
}

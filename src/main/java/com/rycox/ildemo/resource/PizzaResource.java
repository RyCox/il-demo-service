package com.rycox.ildemo.resource;

import com.rycox.ildemo.domain.Pizza;
import com.rycox.ildemo.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class PizzaResource {

    @Autowired
    PizzaService pizzaService;

    @RequestMapping(method=POST, value="/pizza")
    public Pizza createNewPizza(List<String> ingredientList) {
        return pizzaService.createNewPizza(ingredientList);
    }

    @RequestMapping(method=GET, value="/pizza")
    public Pizza getPizzaById(Long id) {
        return new Pizza();
    }

}

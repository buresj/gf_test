package com.greenfox.orientationexam.models;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<String> pizzaTypes;

    public Menu() {
        this.pizzaTypes = new ArrayList<>();

        pizzaTypes.add("Margherita");
        pizzaTypes.add("Capricciosa");
        pizzaTypes.add("Quattro Stagioni");
        pizzaTypes.add("Vegetariana");
        pizzaTypes.add("Quattro Formaggiue");
        pizzaTypes.add("Marinara");
        pizzaTypes.add("Peperoni");
    }

    public List<String> getPizzas() {
        return pizzaTypes;
    }
}

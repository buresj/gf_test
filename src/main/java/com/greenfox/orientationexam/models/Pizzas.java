package com.greenfox.orientationexam.models;

import java.util.ArrayList;
import java.util.List;

public class Pizzas {

    private List<String> types;

    public Pizzas() {
        this.types = new ArrayList<>();

        types.add("Margherita");
        types.add("Capricciosa");
        types.add("Quattro Stagioni");
        types.add("Vegetariana");
        types.add("Quattro Formaggiue");
        types.add("Marinara");
        types.add("Peperoni");
    }

    public List<String> getMenu() {
        return types;
    }
}

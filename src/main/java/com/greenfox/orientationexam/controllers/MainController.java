package com.greenfox.orientationexam.controllers;


import com.greenfox.orientationexam.models.Order;
import com.greenfox.orientationexam.services.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    private OrderService orderService;

    public MainController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/")
    public String displayMain(Model model) {

        List<String> pizzaTypes = new ArrayList<>();
        pizzaTypes.add("Margherita");
        pizzaTypes.add("Capricciosa");
        pizzaTypes.add("Quattro Stagioni");
        pizzaTypes.add("Vegetariana");
        pizzaTypes.add("Quattro Formaggiue");
        pizzaTypes.add("Marinara");
        pizzaTypes.add("Peperoni");

        model.addAttribute("newOrder", new Order());
        model.addAttribute("pizzaTypes", pizzaTypes);

        return "index";
    }

    @PostMapping("/order")
    public String saveOrder(@ModelAttribute Order order) {
        orderService.save(order);
        return "redirect:/order/" + order.getId();
    }

    @GetMapping("/order/{id}")
    public String displayOrder(@PathVariable long id,
                               Model model){
       model.addAttribute("savedOrder", orderService.findOrderById(id));
       return "order";
    }


}

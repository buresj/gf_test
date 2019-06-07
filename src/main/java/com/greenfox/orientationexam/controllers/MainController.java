package com.greenfox.orientationexam.controllers;

import com.greenfox.orientationexam.models.Order;
import com.greenfox.orientationexam.models.Menu;
import com.greenfox.orientationexam.services.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    private OrderService orderService;

    public MainController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/")
    public String displayMain(Model model) {
        model.addAttribute("newOrder", new Order());
        model.addAttribute("pizzas", new Menu().getPizzas());
        return "index";
    }

    @PostMapping("/order")
    public String saveOrder(@ModelAttribute Order order) {
        orderService.save(order);
        return "redirect:/order/" + order.getId();
    }

    @GetMapping("/order/{id}")
    public String displayOrder(@PathVariable long id,
                               Model model) {
        model.addAttribute("savedOrder", orderService.findOrderById(id));
        return "order";
    }

    @GetMapping("/statistics")
    public String displayStatistics(Model model) {
        model.addAttribute("topPizzas", orderService.findThreeMostOrderedPizzas());
        return "statistics";
    }
}

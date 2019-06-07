package com.greenfox.orientationexam.controllers;

import com.greenfox.orientationexam.services.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {

    private OrderService orderService;

    public APIController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/api/orders/{id}")
    public ResponseEntity getOrder(@PathVariable long id) {
        return new ResponseEntity<>(orderService.findOrderById(id).get(), HttpStatus.ACCEPTED);
    }
}

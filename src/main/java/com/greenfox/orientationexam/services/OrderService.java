package com.greenfox.orientationexam.services;

import com.greenfox.orientationexam.models.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    void saveOrder(Order order);
    Optional<Order> findOrderById(long id);
    List<String> findThreeMostOrderedPizzas();
}

package com.greenfox.orientationexam.services;

import com.greenfox.orientationexam.models.Order;
import com.greenfox.orientationexam.repositories.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    private OrderRepo orderRepo;

    @Autowired
    public OrderServiceImpl(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    @Override
    public void save(Order order) {
        orderRepo.save(order);
    }

    @Override
    public Optional<Order> findOrderById(long id) {
        return orderRepo.findById(id);
    }
}

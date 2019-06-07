package com.greenfox.orientationexam.repositories;

import com.greenfox.orientationexam.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepo extends CrudRepository<Order, Long> {
}

package com.greenfox.orientationexam.repositories;

import com.greenfox.orientationexam.models.Order;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface OrderRepo extends CrudRepository<Order, Long> {

    @Query(value = "SELECT id, pizza, address, name FROM orders GROUP BY pizza ORDER BY COUNT(*) DESC LIMIT 3", nativeQuery = true)
    List<Order> findThreeMostOrderedPizzas();
}

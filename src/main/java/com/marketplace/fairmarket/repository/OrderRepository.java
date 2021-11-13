package com.marketplace.fairmarket.repository;

import com.marketplace.fairmarket.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrderRepository extends MongoRepository<Order,Integer> {
    Optional<Order> findOrderById(Integer id);
}

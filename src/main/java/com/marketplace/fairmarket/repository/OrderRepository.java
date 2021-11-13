package com.marketplace.fairmarket.repository;

import com.marketplace.fairmarket.model.Order;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface OrderRepository extends MongoRepository<Order,Integer> {
    Optional<Order> findOrderBy_id(ObjectId _id);
    Optional<Order> findOrderByNumber(UUID number);
}

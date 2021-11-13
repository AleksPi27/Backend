package com.marketplace.fairmarket.repository;

import com.marketplace.fairmarket.model.Shop;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopRepository extends MongoRepository<Shop, Integer> {
}

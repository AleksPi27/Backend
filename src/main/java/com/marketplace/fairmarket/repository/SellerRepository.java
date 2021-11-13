package com.marketplace.fairmarket.repository;

import com.marketplace.fairmarket.model.Seller;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepository extends MongoRepository<Seller, Integer> {
}

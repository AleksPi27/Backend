package com.marketplace.fairmarket.repository;

import com.marketplace.fairmarket.model.*;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ReviewRepository extends MongoRepository<Review, Integer> {
    Optional<Review> findReviewBy_id (ObjectId _id);
    Optional<List<Review>> findAllByProduct (Product product);
    Optional<List<Review>> findAllByProducer (Producer producer);
    Optional<List<Review>> findAllByCustomer (Customer customer);
}

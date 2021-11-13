package com.marketplace.fairmarket.repository;

import com.marketplace.fairmarket.model.*;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ReviewRepository extends MongoRepository<Review, Integer> {
    Optional<Review> findReviewById (Integer id);
    Optional<List<Review>> findAllByProduct (Product product);
    Optional<List<Review>> findAllBySeller (Seller seller);
    Optional<List<Review>> findAllByShop (Shop shop);
    Optional<List<Review>> findAllByCustomer (Customer customer);
}

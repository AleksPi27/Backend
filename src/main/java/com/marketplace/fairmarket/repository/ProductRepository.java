package com.marketplace.fairmarket.repository;

import com.marketplace.fairmarket.model.Product;
import com.marketplace.fairmarket.model.Seller;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends MongoRepository<Product, Integer> {
    Optional<Product> findProductById(Integer id);
    Optional<List<Product>> findAllBySeller(Seller seller);
    List<Product> findAll();
}

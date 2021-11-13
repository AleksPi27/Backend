package com.marketplace.fairmarket.repository;

import com.marketplace.fairmarket.model.Product;
import com.marketplace.fairmarket.model.Producer;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends MongoRepository<Product, Integer> {
    Optional<Product> findProductBy_id(ObjectId _id);
    Optional<Product> findProductById(Integer id);
    Optional<List<Product>> findAllByProducer(Producer producer);
    List<Product> findAll();
    Optional<List<Product>> findAllByNameRegex(String searchString);
}

package com.marketplace.fairmarket.repository;

import com.marketplace.fairmarket.model.Customer;
import com.marketplace.fairmarket.model.Producer;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProducerRepository extends MongoRepository<Producer, Integer> {
    Optional<Producer> findProducerBy_id (ObjectId _id);
    Producer findProducerByNameAndSurnameAndEmail(String name, String surname, String email);
}

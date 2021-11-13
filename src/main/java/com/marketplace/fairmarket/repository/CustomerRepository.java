package com.marketplace.fairmarket.repository;

import com.marketplace.fairmarket.model.Customer;
import com.marketplace.fairmarket.model.Order;
import com.marketplace.fairmarket.model.Review;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, Integer> {
    Optional<Customer> findCustomerBy_id(ObjectId _id);
    Optional<Customer> findCustomerByChatId(Long chatId);
    Optional<Customer> findCustomerByNameAndSurname(String name, String surname);
    Customer findCustomerByNameAndSurnameAndEmail(String name, String surname, String email);
    Optional<Customer> findCustomerByEmailAndPassword(String email, String password);
}

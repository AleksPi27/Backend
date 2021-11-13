package com.marketplace.fairmarket.repository;

import com.marketplace.fairmarket.model.Customer;
import com.marketplace.fairmarket.model.Order;
import com.marketplace.fairmarket.model.Review;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, Integer> {
    Optional<Customer> findCustomerById(Integer id);
    Optional<Customer> findCustomerByNameAndSurname(String name, String surname);
    Optional<Customer> findCustomerByEmailAndPassword(String email, String password);
}

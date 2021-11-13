package com.marketplace.fairmarket.service;

import com.marketplace.fairmarket.model.Customer;
import com.marketplace.fairmarket.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public Optional<Customer> getCustomer(ObjectId id){
        return customerRepository.findCustomerBy_id(id);
    }

    public Optional<Customer> getCustomerByChatId(Long chatId){
        return customerRepository.findCustomerByChatId(chatId);
    }

    public Optional<Customer> getCustomerByEmailAndPassword(String email, String password){
        return customerRepository.findCustomerByEmailAndPassword(email, password);
    }
}

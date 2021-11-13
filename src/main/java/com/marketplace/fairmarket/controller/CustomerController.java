package com.marketplace.fairmarket.controller;

import com.marketplace.fairmarket.dto.CustomerDTO;
import com.marketplace.fairmarket.model.Customer;
import com.marketplace.fairmarket.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/customers")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @PostMapping("/customer")
    public Optional<Customer> showUserInfo(@RequestBody CustomerDTO customerDTO){
        System.out.println(customerDTO);
        return customerService.getCustomerByEmailAndPassword(customerDTO.getEmail(), customerDTO.getPassword());
    }

    @GetMapping("/customerById/{id}")
    public Optional<Customer> getCustomerById(@PathVariable("id") String id){
        System.out.println(id);
        System.out.println(customerService.getCustomer(new ObjectId(id)));
        return customerService.getCustomer(new ObjectId(id));
    }
}

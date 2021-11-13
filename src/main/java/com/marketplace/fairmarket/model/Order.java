package com.marketplace.fairmarket.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.Id;

@Document(collection = "orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    private Integer id;

    private String time;

    private String number;

    @DBRef
    private Customer customer;

    @DBRef
    private Seller seller;

    @DBRef
    private Shop shop;
}

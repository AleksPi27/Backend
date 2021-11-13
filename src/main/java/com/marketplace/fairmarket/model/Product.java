package com.marketplace.fairmarket.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.Id;

@Document(collection = "products")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {

    @Id
    private Integer id;

    private String name;

    private Integer amount;

    private Float rating;

    @DBRef
    private Shop shop;

    @DBRef
    private Seller seller;
}

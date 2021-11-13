package com.marketplace.fairmarket.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document(collection = "reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Review {

    @Id
    private Integer id;

    private String text;

    @DBRef
    private Customer customer;

    @DBRef
    private Seller seller;

    @DBRef
    private Shop shop;

    @DBRef
    private Product product;
}

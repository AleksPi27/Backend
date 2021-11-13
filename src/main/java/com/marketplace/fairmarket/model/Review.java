package com.marketplace.fairmarket.model;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Review {

    @Id
    private ObjectId _id;

    private String text;

    @DBRef
    private Customer customer;

    @DBRef
    private Producer producer;

    @DBRef
    private Product product;
}

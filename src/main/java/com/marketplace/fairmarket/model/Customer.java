package com.marketplace.fairmarket.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.UUID;

@Document(collection = "customers")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Customer {

    @Id
    private ObjectId _id;

    private String name;

    private String surname;

    private String email;

    private String phoneNumber;

    private String password;

    private String address;

    private Long chatId;

    @DBRef
    private List<Order> orders;

    @DBRef
    private List<Review> productReviews;

    @DBRef
    private List<Review> producerReviews;

    @DBRef
    private List<Review> shopReviews;
}

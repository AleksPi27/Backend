package com.marketplace.fairmarket.model;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "producers")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Producer {

    @Id
    private ObjectId _id;

    private String name;

    private String surname;

    private String email;

    private String phoneNumber;

    private String password;

    @DBRef
    private List<Order> orders;

    @DBRef
    private List<Review> reviews;

    private Float rating;
}

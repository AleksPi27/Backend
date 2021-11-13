package com.marketplace.fairmarket.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Document(collection = "shops")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Shop {

    @Id
    private Integer id;

    private String name;

    @DBRef
    private List<Seller> sellers;

    private Float rating;

    @DBRef
    private List<Product> products;

    @DBRef
    private List<Review> shopReviews;
}

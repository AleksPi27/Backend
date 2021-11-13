package com.marketplace.fairmarket.model;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "products")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product implements Comparable<Product> {

    @Id
    private ObjectId _id;

    private String name;

    private Float amount;

    private Float rating;

    private String category;// можно Enum впихнуть

    private Float price;

    @DBRef
    private Producer producer;

    @Override
    public int compareTo(Product p){
        return this.getRating().compareTo(p.getRating());
    }
}

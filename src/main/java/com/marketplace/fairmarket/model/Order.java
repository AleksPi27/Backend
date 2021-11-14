package com.marketplace.fairmarket.model;

import com.marketplace.fairmarket.enums.OrderStatus;
import com.marketplace.fairmarket.service.OrderService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Optional;
import java.util.UUID;


@Document(collection = "orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    private ObjectId _id;

    private String time;

    private UUID number;

    @DBRef
    private Customer customer;

    @DBRef
    private Producer producer;

    private OrderStatus status;

}

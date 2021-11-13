package com.marketplace.fairmarket.dto;

import lombok.Getter;

@Getter
public class OrderDTO {
    private String userName;
    private String userSurname;
    private String userPhoneNumber;
    private String userEmail;
    private String producerName;
    private String producerSurname;
    private String producerEmail;
    private Float cost;
    private String deliveryAddress;
    private Boolean groupDeliveryConsent;
}

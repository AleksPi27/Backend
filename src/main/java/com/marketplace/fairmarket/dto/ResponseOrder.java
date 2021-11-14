package com.marketplace.fairmarket.dto;

import lombok.*;

import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
public class ResponseOrder {
    private UUID uuid;
    private boolean status;

}

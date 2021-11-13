package com.marketplace.fairmarket.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
public class ResponseOrder {
    private UUID uuid;
    private Boolean status;

    public ResponseOrder(UUID number, boolean b) {
        this.uuid =number;
        this.status=b;
    }
}

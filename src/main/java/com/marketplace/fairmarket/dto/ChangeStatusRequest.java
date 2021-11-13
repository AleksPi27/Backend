package com.marketplace.fairmarket.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.UUID;

@Getter
@RequiredArgsConstructor
public class ChangeStatusRequest {
    private UUID orderNumber;
    private String message;
}

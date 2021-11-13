package com.marketplace.fairmarket.controller;

import com.marketplace.fairmarket.dto.ChangeStatusRequest;
import com.marketplace.fairmarket.dto.OrderDTO;
import com.marketplace.fairmarket.dto.ResponseOrder;
import com.marketplace.fairmarket.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping("/make")
    public ResponseEntity<String> makeOrder(@RequestBody OrderDTO orderDTO){
        if (orderService.makeOrder(orderDTO).getStatus()) return ResponseEntity.status(HttpStatus.OK).body("Successful");
        else return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Unsuccessful");
    }

    @PostMapping("/make/updateStatus")
    public ResponseEntity.BodyBuilder updateOrderStatus(@RequestBody ChangeStatusRequest changeStatusRequest){
        if (changeStatusRequest.getMessage().equals("success")) {
            orderService.updateOrderStatus(changeStatusRequest.getOrderNumber());
            return ResponseEntity.status(HttpStatus.OK);
        } else return ResponseEntity.status(HttpStatus.BAD_REQUEST);
    }
}

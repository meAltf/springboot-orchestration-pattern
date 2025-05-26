package com.learn.shipping.orchestration_shipping.Controller;

import com.learn.shipping.orchestration_shipping.DTO.OrderRequestDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shipping")
public class ShippingController {

    @PostMapping("/ship")
    public ResponseEntity<String> shipOrder(@RequestBody OrderRequestDTO order) {
        System.out.println("Shipped order: " + order.getOrderId());
        return ResponseEntity.ok("Order Shipped");
    }

}

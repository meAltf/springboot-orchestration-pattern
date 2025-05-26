package com.learn.order.choreography_order.Controller;

import com.learn.order.choreography_order.DTO.OrderEventDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private KafkaTemplate<String, OrderEventDTO> kafkaTemplate;

    @PostMapping
    public ResponseEntity<String> placeOrder(@RequestBody OrderEventDTO order) {
        order.setStatus("order-created");
        kafkaTemplate.send("order-created", order);
        return ResponseEntity.ok("Order Created Event Sent");
    }
}


package com.learn.order.orchestration_order.Controller;

import com.learn.order.orchestration_order.IClient.InventoryClient;
import com.learn.order.orchestration_order.IClient.PaymentClient;
import com.learn.order.orchestration_order.IClient.ShippingClient;
import com.learn.shipping.orchestration_shipping.DTO.OrderRequestDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private final InventoryClient inventoryClient;

    @Autowired
    private final PaymentClient paymentClient;

    @Autowired
    private final ShippingClient shippingClient;

    @PostMapping
    public ResponseEntity<String> placeOrder(@RequestBody Order order) {

        if (!inventoryClient.checkInventory(order.getProductId())) {
            return ResponseEntity.badRequest().body("Out of stock");
        }

        if (!paymentClient.makePayment(order)) {
            return ResponseEntity.badRequest().body("Payment failed");
        }

        shippingClient.shipOrder(order);
        return ResponseEntity.ok("Order Placed Successfully!");
    }
}

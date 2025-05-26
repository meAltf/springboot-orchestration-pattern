package com.learn.inventory.choreography_inventory.DTO;

import lombok.Data;

@Data
public class OrderEventDTO {
    private String orderId;
    private String productId;
    private double amount;
    private String status; // order-created, inventory-checked, payment-completed

}

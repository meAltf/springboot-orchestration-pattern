package com.learn.inventory.orchestration_inventory.DTO;

import lombok.Data;

@Data
public class OrderRequestDTO {
    private String orderId;
    private String productId;
    private Double amount;

}


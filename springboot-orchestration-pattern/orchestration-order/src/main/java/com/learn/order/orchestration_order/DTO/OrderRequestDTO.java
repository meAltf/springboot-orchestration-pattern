package com.learn.order.orchestration_order.DTO;

import lombok.Data;

@Data
public class OrderRequestDTO {
    private String orderId;
    private String productId;
    private Double amount;

}


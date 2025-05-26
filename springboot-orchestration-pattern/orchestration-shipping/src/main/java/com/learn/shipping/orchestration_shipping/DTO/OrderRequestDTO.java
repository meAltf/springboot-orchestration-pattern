package com.learn.shipping.orchestration_shipping.DTO;

import lombok.Data;

@Data
public class OrderRequestDTO {
    private String orderId;
    private String productId;
    private Double amount;

}


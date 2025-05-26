package com.learn.payment.orchestration_payment.DTO;

import lombok.Data;

@Data
public class OrderRequestDTO {
    private String orderId;
    private String productId;
    private Double amount;

}


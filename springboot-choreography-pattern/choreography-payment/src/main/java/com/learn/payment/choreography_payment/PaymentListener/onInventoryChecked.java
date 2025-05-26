package com.learn.payment.choreography_payment.PaymentListener;

import com.learn.payment.choreography_payment.DTO.OrderEventDTO;

@KafkaListener(topics = "inventory-checked", groupId = "payment")
public void onInventoryChecked(OrderEventDTO order) {

    System.out.println("Payment started for: " + order.getOrderId());
    order.setStatus("payment-completed");
    kafkaTemplate.send("payment-completed", order);
}

package com.learn.shipping.choreography_shipping.ShippingListener;

import com.learn.shipping.choreography_shipping.DTO.OrderEventDTO;

@KafkaListener(topics = "payment-completed", groupId = "shipping")
public void onPaymentCompleted(OrderEventDTO order) {

    System.out.println("Shipping started for: " + order.getOrderId());
    // No next event — end of chain
}


package com.learn.inventory.choreography_inventory.InventoryListener;

@KafkaListener(topics = "order-created", groupId = "inventory")
public void onOrderCreated(OrderEventDTO order) {

    System.out.println("Inventory received order: " + order.getOrderId());
    // Assume inventory is available
    order.setStatus("inventory-checked");
    kafkaTemplate.send("inventory-checked", order);
}

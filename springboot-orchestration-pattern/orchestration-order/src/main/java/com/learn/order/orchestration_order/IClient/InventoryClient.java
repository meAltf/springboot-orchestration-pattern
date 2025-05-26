package com.learn.order.orchestration_order.IClient;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.cloud.openfeign.FeignClient;


@FeignClient(name = "inventory-service", url = "http://localhost:8081")
public interface InventoryClient {

    @GetMapping("/inventory/check/{productId}")
    boolean checkInventory(@PathVariable String productId);
}

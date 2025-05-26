package com.learn.order.orchestration_order.IClient;

import com.learn.order.orchestration_order.DTO.OrderRequestDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "shipping", url = "http://localhost:8083")
interface ShippingClient {

    @PostMapping("/shipping/ship")
    String shipOrder(@RequestBody OrderRequestDTO order);
}
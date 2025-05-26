package com.learn.order.orchestration_order.IClient;

import com.learn.order.orchestration_order.DTO.OrderRequestDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "payment", url = "http://localhost:8082")
interface PaymentClient {

    @PostMapping("/payment/pay")
    String makePayment(@RequestBody OrderRequestDTO order);
}
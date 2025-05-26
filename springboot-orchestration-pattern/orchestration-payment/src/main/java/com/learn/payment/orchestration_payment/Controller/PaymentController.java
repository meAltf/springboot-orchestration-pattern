package com.learn.payment.orchestration_payment.Controller;

import com.learn.payment.orchestration_payment.DTO.OrderRequestDTO;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @PostMapping("/pay")
    public ResponseEntity<String> makePayment(@RequestBody OrderRequestDTO order) {
        System.out.println("Payment processed for: " + order.getAmount());
        return ResponseEntity.ok("Payment Successful");
    }
}

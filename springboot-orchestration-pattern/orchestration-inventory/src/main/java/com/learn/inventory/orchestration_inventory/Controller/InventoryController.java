package com.learn.inventory.orchestration_inventory.Controller;

import com.learn.inventory.orchestration_inventory.DTO.OrderRequestDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @PostMapping("/check")
    public ResponseEntity<String> checkInventory(@RequestBody OrderRequestDTO order) {
        System.out.println("Inventory checked for: " + order.getProductId());
        return ResponseEntity.ok("Inventory Available");
    }
}

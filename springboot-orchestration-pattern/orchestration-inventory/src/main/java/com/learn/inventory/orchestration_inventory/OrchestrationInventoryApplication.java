package com.learn.inventory.orchestration_inventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableFeignClients
@SpringBootApplication
public class OrchestrationInventoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrchestrationInventoryApplication.class, args);
	}

}

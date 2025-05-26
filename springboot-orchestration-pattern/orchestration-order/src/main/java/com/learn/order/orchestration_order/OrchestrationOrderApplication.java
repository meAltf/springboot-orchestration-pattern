package com.learn.order.orchestration_order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableFeignClients
@SpringBootApplication
public class OrchestrationOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrchestrationOrderApplication.class, args);
	}

}

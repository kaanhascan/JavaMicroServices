package com.project.Java.Order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class  OrdersvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrdersvcApplication.class, args);
	}

}

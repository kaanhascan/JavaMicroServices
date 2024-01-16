package com.project.productsvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProductsvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductsvcApplication.class, args);
	}

}

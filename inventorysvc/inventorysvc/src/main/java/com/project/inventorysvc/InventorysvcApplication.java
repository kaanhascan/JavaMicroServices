package com.project.inventorysvc;

import com.project.inventorysvc.model.Inventory;
import com.project.inventorysvc.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventorysvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventorysvcApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository){
		return args -> {
			Inventory inventory = new Inventory();
			inventory.setSkuCode("Pear_13");
			inventory.setQuantity(50);

			Inventory inventory1 = new Inventory();
			inventory1.setSkuCode("Pear_13_blue");
			inventory1.setQuantity(5);

			inventoryRepository.save(inventory);
			inventoryRepository.save(inventory1);
		};
	}
}
package com.example.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.example"})
@EnableJpaRepositories("com.example.repository")
@EntityScan("com.example.model")
public class ItemCatalogApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemCatalogApplication.class, args);
	}

}

package com.example.configurations;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.repository.ItemRepository;
import com.example.model.Item;

@Component
public class ItemInitializer implements CommandLineRunner {

	@Autowired
	private ItemRepository itemRepository;	

	@Override
	public void run(String... args) throws Exception {
		Stream.of("Lining", "PUMA", "Bad Boy", "Air Jordan", "Nike", "Adidas",
				"Reebok").forEach(item -> {
			Item brand = new Item();
			brand.setName(item);
			this.itemRepository.save(brand);
		});
	}
}

package com.example.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Item;
import com.example.repository.ItemRepository;

@RestController
public class ItemCatalogController {
	
	@Autowired
	private ItemRepository itemRepository;
	
	@GetMapping("/items")
    public Collection<Item> listOfItems() {
		return this.itemRepository.findAll();
	};
	
}

package com.example.controller;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.clients.ItemClient;
import com.example.model.Item;

@RestController
public class GoodItemApiAdapterRestController {
	
	@Autowired
	private ItemClient itemClient;    

    @GetMapping("/top-brands")
    public Collection<Item> goodItems() {
        return itemClient.readItems().stream().filter(this::isGreat).collect(Collectors.toList());
    }

    private boolean isGreat(Item item) {
        return !item.getName().equals("Nike") &&
                !item.getName().equals("Adidas") &&
                !item.getName().equals("Reebok");
    }    
    
}

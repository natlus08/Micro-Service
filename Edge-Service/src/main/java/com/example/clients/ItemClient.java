package com.example.clients;

import java.util.Collection;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.model.Item;

@FeignClient(name = "item-catalog-service", fallback = ItemClientFallBack.class)
public interface ItemClient {

    @GetMapping("/items")
    Collection<Item> readItems();
}

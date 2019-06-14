package com.example.clients;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.example.model.Item;

@Component
public class ItemClientFallBack implements ItemClient {

	@Override
	public Collection<Item> readItems() {
		return new ArrayList<Item>();
	}

}

package com.example.Shoppingmall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Shoppingmall.entity.Item;
import com.example.Shoppingmall.service.ItemService;

@RestController
public class ItemController {
	@Autowired
	ItemService is;
	
	@PostMapping("/addItem")
	public Item addItem(@RequestBody Item it) {
		return is.addItem(it);
	}
	
	@PutMapping("/updateItem")
	public Item updateItem(@RequestBody Item it) {
		return is.updateItem(it);
	}
	@DeleteMapping("/deleteItem/{itemId}")
	public Item deleteItem(@PathVariable("itemId") long itemId) {
		is.deleteitem(itemId);
		return null;
	}
	@GetMapping("/getItem/{itemId}")
	public Item  getitem(@PathVariable long itemId) {
		return is.getitem()
				.stream()
				.filter(o -> o.getItemId() == itemId)
	             .findFirst()
	             .orElse(null);
	}
		
}

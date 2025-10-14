package com.example.Shoppingmall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Shoppingmall.entity.Item;
import com.example.Shoppingmall.repo.Itemrepo;

@Service
public class ItemService {
	@Autowired
	Itemrepo ir;
	
	//insert
	public Item addItem(Item it) {
		return ir.save(it);
	}
	//update
	public Item updateItem(Item it) {
		return ir.save(it);
	}
	//Retrieve
	public List<Item> getitem()
	{
		return ir.findAll();
	}
	//delete
	public void deleteitem(long itemId)
	{
		ir.deleteById(itemId);
	}
	 public Item getItemById(long itemId) {
	        return ir.findById(itemId).orElse(null);
	    }

}

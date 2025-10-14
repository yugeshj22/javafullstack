package com.example.Shoppingmall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Shoppingmall.entity.Order;
import com.example.Shoppingmall.repo.OrderRepository;

@Service
public class OrderService {
	@Autowired
	OrderRepository or;
	//insert
	public Order addOrder(Order od) {
		return or.save(od);
	}
	//update
	public Order updateOrder(Order od) {
	    return or.save(od);
	}
	//select
		public List<Order> getod()
		{
			return or.findAll();
		}
		//delete
		public void deleteOrder(int orderId)
		{
			or.deleteById(orderId);
		}
		
}

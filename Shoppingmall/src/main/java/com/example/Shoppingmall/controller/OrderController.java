package com.example.Shoppingmall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Shoppingmall.entity.Order;
import com.example.Shoppingmall.service.OrderService;

@RestController
public class OrderController {
	@Autowired
	OrderService os;
	
	@PostMapping("/addOrder")
	public Order addOrder(@RequestBody Order od) {
		return os.addOrder(od);
	}
	
	@PutMapping("/updateOrder")
	public Order updateOrder(@RequestBody Order od) {
	    return os.updateOrder(od);
	}
	
	@DeleteMapping("/deleteOrder/{orderId}")
	public Order deleteOrder(@PathVariable int orderId) {
	    os.deleteOrder(orderId);
	    return null;
	}
	
	//search
	@GetMapping("/getAllOrders/{orderId}")
	public Order  getod(@PathVariable int orderId) {
		return os.getod()
	             .stream()
	             .filter(o -> o.getOrderId() == orderId)
	             .findFirst()
	             .orElse(null);
	}

}

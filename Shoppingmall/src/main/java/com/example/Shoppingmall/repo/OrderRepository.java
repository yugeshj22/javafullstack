package com.example.Shoppingmall.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Shoppingmall.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{

}

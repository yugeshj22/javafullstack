package com.example.Shoppingmall.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Shoppingmall.entity.Item;

public interface Itemrepo extends JpaRepository<Item ,Long>{

}

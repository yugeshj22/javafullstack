package com.example.demoproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoproject.entity.Employee;

public interface Emprepo extends JpaRepository<Employee,Integer>{

}

package com.example.spring.jpa.JPADemo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.spring.jpa.JPADemo.User.Product;

@Component
public interface ProductRepo extends JpaRepository<Product, Integer>{

}

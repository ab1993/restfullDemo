package com.example.spring.jpa.JPADemo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.jpa.JPADemo.User.ProductDetail;

public interface ProductDetailRepo extends JpaRepository<ProductDetail, Integer> {

}

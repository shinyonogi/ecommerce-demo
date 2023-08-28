package com.visional24.ecsite.repository;

import com.visional24.ecsite.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {}

package com.visional24.ecsite.repository;

import com.visional24.ecsite.model.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {}

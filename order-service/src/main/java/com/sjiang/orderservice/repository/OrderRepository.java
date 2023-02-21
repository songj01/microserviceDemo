package com.sjiang.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sjiang.orderservice.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

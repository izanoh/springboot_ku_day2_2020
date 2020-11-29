package com.app.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.restaurant.entity.OrderEntity;

@Repository
public interface OrderRepository 
	extends JpaRepository<OrderEntity, Integer> {

}

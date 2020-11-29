package com.app.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.restaurant.entity.OrderDetailEntity;

@Repository
public interface OrderDetailRepository 
	extends JpaRepository<OrderDetailEntity, Integer> {

}

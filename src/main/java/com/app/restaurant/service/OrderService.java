package com.app.restaurant.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.restaurant.entity.OrderEntity;
import com.app.restaurant.repository.OrderRepository;
import com.app.restaurant.request.SaveOrderRequest;
import com.app.restaurant.response.OrderObject;
import com.app.restaurant.response.OrderResponse;
import com.app.restaurant.response.SaveOrderResponse;

@Service
public class OrderService {
	@Autowired
	private OrderRepository orderRepository;
	
	public OrderResponse getOrder() {
		// new Class OrderResponse
		OrderResponse response = new OrderResponse();
		// query List of Order from orderRepository
		List<OrderEntity> listOfOrder = orderRepository.findAll();
		// set List of Order to OrderRespose
		List<OrderObject> orders = new ArrayList<>();
		for (OrderEntity entity : listOfOrder) {
			OrderObject obj = new OrderObject();
			BeanUtils.copyProperties(entity, obj);
			orders.add(obj);
		}
		// then return
		response.setOrderLists(orders);
		return response;
	}
	
	public SaveOrderResponse saveOrder(SaveOrderRequest request) {
		// new Class SaveOrderRequest
		// new Object from OrderEntity
		OrderEntity entity = new OrderEntity();
		// set request property to orderEntity
		BeanUtils.copyProperties(request, entity);
		// call orderRepository.save(object of OrderEntity)
		OrderEntity orderSaved = orderRepository.save(entity);
		// new Class SaveOrderResponse
		// new Object from SaveOrderResponse
		SaveOrderResponse response = new SaveOrderResponse();
		
		// set value with orderId to SaveOrderResponse
		BeanUtils.copyProperties(orderSaved, response);
		
		// then return
		return response;
	}
}


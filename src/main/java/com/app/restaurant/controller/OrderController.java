package com.app.restaurant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.restaurant.request.SaveOrderRequest;
import com.app.restaurant.response.OrderResponse;
import com.app.restaurant.response.SaveOrderResponse;
import com.app.restaurant.service.OrderService;

@RestController
public class OrderController {
	@Autowired
	private OrderService orderService;
	
	@GetMapping("/getOrder")
	public OrderResponse getOrder() {
		return orderService.getOrder();
	}
	
	@PostMapping("/saveOrder")
	public SaveOrderResponse saveOrder(@RequestBody SaveOrderRequest request) {
		// Call orderService.saveOrder()
		// then return Order Object with orderId
		return orderService.saveOrder(request);
	}
}





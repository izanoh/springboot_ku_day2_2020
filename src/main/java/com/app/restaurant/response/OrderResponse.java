package com.app.restaurant.response;

import java.util.List;

public class OrderResponse {
	private List<OrderObject> orderLists;

	public List<OrderObject> getOrderLists() {
		return orderLists;
	}

	public void setOrderLists(List<OrderObject> orderLists) {
		this.orderLists = orderLists;
	}
}

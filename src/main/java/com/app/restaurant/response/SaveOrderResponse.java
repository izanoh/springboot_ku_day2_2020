package com.app.restaurant.response;

import java.util.List;

import com.app.restaurant.entity.OrderDetailEntity;

public class SaveOrderResponse {
	private Integer orderId;
	private String customerName;
	private String mobile;
	private String email;
	private String address;
	private String orderStatus;
	private List<OrderDetailEntity> detailEntities;
	
	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public List<OrderDetailEntity> getDetailEntities() {
		return detailEntities;
	}

	public void setDetailEntities(List<OrderDetailEntity> detailEntities) {
		this.detailEntities = detailEntities;
	}
	
}

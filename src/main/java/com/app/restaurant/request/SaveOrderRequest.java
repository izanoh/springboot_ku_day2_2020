package com.app.restaurant.request;

import java.util.List;

public class SaveOrderRequest {
	private String customerName;
	private String mobile;
	private String email;
	private String address;
	private String orderStatus;
	private List<DetailRequest> details;
	public List<DetailRequest> getDetails() {
		return details;
	}
	public void setDetails(List<DetailRequest> details) {
		this.details = details;
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
}

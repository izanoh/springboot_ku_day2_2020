package com.app.restaurant.request;

public class DetailRequest {

	private Integer menuId;
	private String menuName;
	private Integer quantities;
	private Double price;
	private String status;
	public Integer getMenuId() {
		return menuId;
	}
	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public Integer getQuantities() {
		return quantities;
	}
	public void setQuantities(Integer quantities) {
		this.quantities = quantities;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}

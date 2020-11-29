package com.app.restaurant.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="customer_order_detail")
public class OrderDetailEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "detail_id")
	private Integer detailId;

	@Column(name = "order_id")
	private Integer orderId;
	
	@Column(name = "menu_id")
	private Integer menuId;
	
	@Column(name = "menu_name")
	private String menuName;
	
	@Column(name = "quantities")
	private Integer quantities;
	
	@Column(name = "price")
	private Double price;
	
	@Column(name = "status")
	private String status;
	
	public OrderDetailEntity() {
		super();
	}

	public OrderDetailEntity(Integer orderId, Integer menuId, String menuName, Integer quantities, Double price,
			String status) {
		super();
		this.orderId = orderId;
		this.menuId = menuId;
		this.menuName = menuName;
		this.quantities = quantities;
		this.price = price;
		this.status = status;
	}
	
	public OrderDetailEntity(Integer menuId, String menuName, Integer quantities, Double price, String status) {
		super();
		this.menuId = menuId;
		this.menuName = menuName;
		this.quantities = quantities;
		this.price = price;
		this.status = status;
	}

	public Integer getDetailId() {
		return detailId;
	}

	public void setDetailId(Integer detailId) {
		this.detailId = detailId;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

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

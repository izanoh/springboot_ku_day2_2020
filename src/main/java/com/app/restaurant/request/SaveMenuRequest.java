package com.app.restaurant.request;

import io.swagger.annotations.ApiModelProperty;

public class SaveMenuRequest {
	
	@ApiModelProperty(example="name menu")
	private String name;
	
	@ApiModelProperty(example="description name")
	private String description;
	
	@ApiModelProperty(example="images url")
	private String images;
	
	@ApiModelProperty(example="price menu")
	private Double price;
	
	@ApiModelProperty(example="category menu")
	private String types;
	
	@ApiModelProperty(example = "A",notes="set 'A' when show menu, set 'D' when don't show menu.")
	private String status;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getTypes() {
		return types;
	}

	public void setTypes(String types) {
		this.types = types;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}

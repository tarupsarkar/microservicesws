package com.example.demo.prodinfo.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ProductInfo implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	private String productId;
	
	private String productName;
	
	private List<ItemInfo> items;
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public List<ItemInfo> getItems() {
		return items;
	}
	public void setItems(List<ItemInfo> items) {
		this.items = items;
	}
}

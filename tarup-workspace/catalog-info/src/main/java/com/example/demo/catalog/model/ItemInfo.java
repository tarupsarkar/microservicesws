package com.example.demo.catalog.model;

import java.io.Serializable;

public class ItemInfo implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	private String itemCode;
	
	public ItemInfo() {
		super();
	}
	
	public ItemInfo(String itemCode) {
		super();
		this.itemCode = itemCode;
	}
	
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
}
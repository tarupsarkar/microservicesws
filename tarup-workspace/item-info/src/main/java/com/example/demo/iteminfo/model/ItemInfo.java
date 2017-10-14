package com.example.demo.iteminfo.model;

import java.io.Serializable;

public class ItemInfo implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	private String itemCode;
	
	private String itemDesc;
	
	public ItemInfo() {
		super();
	}
	
	public ItemInfo(String itemCode, String itemDesc) {
		super();
		this.itemCode = itemCode;
		this.itemDesc = itemDesc;
	}
	
	public String getItemDesc() {
		return itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
}
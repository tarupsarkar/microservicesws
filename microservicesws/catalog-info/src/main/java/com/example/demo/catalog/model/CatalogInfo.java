package com.example.demo.catalog.model;

import java.io.Serializable;
import java.util.List;

public class CatalogInfo implements Serializable {
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	private String catalogId;
	
	private String catalogDesc;
	
	private List<ItemInfo> itemInfos;
	
	public List<ItemInfo> getItemInfos() {
		return itemInfos;
	}

	public void setItemInfos(List<ItemInfo> itemInfos) {
		this.itemInfos = itemInfos;
	}

	public CatalogInfo() {
		super();
	}
	
	public CatalogInfo(String catalogId, String catalogDesc) {
		super();
		this.catalogId = catalogId;
		this.catalogDesc = catalogDesc;
	}
	
	public String getCatalogId() {
		return catalogId;
	}

	public void setCatalogId(String catalogId) {
		this.catalogId = catalogId;
	}

	public String getCatalogDesc() {
		return catalogDesc;
	}

	public void setCatalogDesc(String catalogDesc) {
		this.catalogDesc = catalogDesc;
	}

}

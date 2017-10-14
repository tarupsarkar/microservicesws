package com.example.demo.prodinfo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.prodinfo.client.ItemInfoClient;
import com.example.demo.prodinfo.model.ProductInfo;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductInfo productInfo;
	@Autowired
	private ItemInfoClient itemInfoClient;

	@Override
	public ProductInfo getProduct() {
		productInfo.setProductId("PR001");
		productInfo.setProductName("Product 1");
		productInfo.setItems(itemInfoClient.getItemInfos());
		return productInfo;
	}

}
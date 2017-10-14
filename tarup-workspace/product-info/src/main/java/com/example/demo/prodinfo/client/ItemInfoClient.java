package com.example.demo.prodinfo.client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.demo.prodinfo.model.ItemInfo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Component
public class ItemInfoClient {

	private String itemInfoUri = "http://localhost:9500/api/iteminfo/fetchitems";

	@SuppressWarnings("unchecked")
	@HystrixCommand(fallbackMethod = "getItemFromCache")
	public List<ItemInfo> getItemInfos() {
		List<ItemInfo> itemInfos = new RestTemplate().getForObject(itemInfoUri, List.class);
		return itemInfos;
	}

	public List<ItemInfo> getItemFromCache() {
		List<ItemInfo> listIInfo = new ArrayList<ItemInfo>();
		ItemInfo itemInfo = new ItemInfo();
		itemInfo.setItemCode("backup");
		listIInfo.add(itemInfo );
		return listIInfo;
	}

}

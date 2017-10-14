package com.example.demo.catalog.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.catalog.model.CatalogInfo;

@Service
public class CatalogServiceImpl implements CatalogService {
	
	@Override
	public List<CatalogInfo> getCatalogInfos() {
		return generateCatalogInfos();
	}
	
	private List<CatalogInfo> generateCatalogInfos() {
		List<CatalogInfo> catalogInfos = new ArrayList<>();
		catalogInfos.add(new CatalogInfo("Cat1","Cat1 Desc")); 
		catalogInfos.add(new CatalogInfo("Cat2","Cat2 Desc"));
		catalogInfos.add(new CatalogInfo("Cat3","Cat3 Desc"));
		return catalogInfos;
	}

}

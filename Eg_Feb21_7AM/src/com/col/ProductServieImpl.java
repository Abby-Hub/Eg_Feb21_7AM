package com.col;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ProductServieImpl implements ProductService {
		Map<String, Product>   productMap  = new LinkedHashMap<>(); // to store any no.of key-value (String-product obj) mappings
	@Override
	public void add(String key, Product product) {
		productMap.put(key, product);
	}

	@Override
	public Map<String, Product> getProducts() {
		if(productMap.isEmpty())
			return null;
		else
			return productMap;
	}

	@Override
	public Product delete(int productId) {  // 1010
		Set<String> allkeys = productMap.keySet();
		for (String key : allkeys) {
			Product product = productMap.get(key);
			if(productId == product.getId()) {
				return productMap.remove(key);
			}
		}
		return null;
	}

	@Override
	public Product get(int productId) {
			Set<String> allkeys = productMap.keySet();
			for (String key : allkeys) {
				Product product = productMap.get(key);
				if(productId == product.getId()) {
					return product;
				}
			}
		return null;
	}

}

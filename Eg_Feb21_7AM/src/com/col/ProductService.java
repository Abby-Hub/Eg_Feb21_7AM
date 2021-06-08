package com.col;

import java.util.Map;

public interface ProductService {
		void add(String key, Product product);  // logic to insert given key & value  (product obj) to map 
		Map<String, Product> getProducts();
		Product delete(int productId); // delete an Entry matched with productId & return deleted product obj (value)
		Product get(int productId);
}

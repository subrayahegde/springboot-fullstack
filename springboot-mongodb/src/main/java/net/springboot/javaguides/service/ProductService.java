package net.springboot.javaguides.service;

import java.util.List;

import net.springboot.javaguides.model.Product;

public interface ProductService {
	Product createProduct(Product product);

	Product updateProduct(Product product);

	List<Product> getAllProduct();

	Product getProductById(String productId);

	void deleteProduct(String id);
}

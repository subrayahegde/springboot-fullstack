package net.springboot.javaguides.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import net.springboot.javaguides.model.Product;
import net.springboot.javaguides.service.ProductService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("/api/v1/employees")
	public ResponseEntity<List<Product>> getAllProduct(){
		return ResponseEntity.ok().body(productService.getAllProduct());
	}
	
	@GetMapping("api/v1/employees/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable String id){
		return ResponseEntity.ok().body(productService.getProductById(id));
	}
	
	@PostMapping("/api/v1/employees")
	public ResponseEntity<Product> createProduct(@RequestBody Product product){
		return ResponseEntity.ok().body(this.productService.createProduct(product));
	}
	
	@PutMapping("api/v1/employees/{id}")
	public ResponseEntity<Product> updateProduct(@PathVariable String id, @RequestBody Product product){
		product.setId(id);
		return ResponseEntity.ok().body(this.productService.updateProduct(product));
	}

	@DeleteMapping("/api/v1/employees/{id}")
	public HttpStatus deleteProduct(@PathVariable String id){
		this.productService.deleteProduct(id);
		return HttpStatus.OK;
	}
}

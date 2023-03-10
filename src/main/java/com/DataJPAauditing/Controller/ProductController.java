package com.DataJPAauditing.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.DataJPAauditing.Entity.Product;
import com.DataJPAauditing.Repository.ProductRepository;

@RestController
public class ProductController {

	@Autowired
	private ProductRepository productRepository;
	
	@PostMapping("product")
	public Product addProduct(@RequestBody Product product) {
		return productRepository.save(product);
	}
}

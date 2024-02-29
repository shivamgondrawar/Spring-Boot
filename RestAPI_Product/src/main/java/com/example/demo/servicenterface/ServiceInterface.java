package com.example.demo.servicenterface;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.Product;

public interface ServiceInterface {

	public String getMassege();
	public List<Product> getProducts();
	public Optional<Product> getProductById(@PathVariable Integer id);
	public List<Product> getProductByName(@PathVariable String name);
	public List<Product> getProductByPrice(@PathVariable double price);
	public void addProduct(@RequestBody Product prod);
	public void deleteProduct(@PathVariable Integer id);
	public Product updateProduct(@RequestBody Product newproduct, @PathVariable Integer id);
}

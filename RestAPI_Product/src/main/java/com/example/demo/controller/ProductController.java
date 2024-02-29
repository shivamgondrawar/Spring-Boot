package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;

@RestController
@RequestMapping("/product")
public class ProductController {

	ProductService ps;
	
	@GetMapping("/")
	public String getMassege() {
		return ps.getMassege();
	}
	
	@GetMapping("/getproducts")
	public List<Product> getProducts(){
		return (List<Product>)ps.getProducts();
	}
	
	@GetMapping("/getproductbyid/{id}")
	public Optional<Product> getProductById(@PathVariable Integer id){
		return ps.getProductById(id);
	}
	
	@GetMapping("/getproductbyname/{name}")
	public List<Product> getProductByName(@PathVariable String name){
		return ps.getProductByName(name);
	}
	
	@GetMapping("/getproductbyprice/{price}")
	public List<Product> getProductByPrice(@PathVariable double price){
		return (List<Product>)ps.getProductByPrice(price);
	}
	
	@PostMapping("/addproduct")
	public void addProduct(@RequestBody Product prod) {
		ps.addProduct(prod);
	}
	
	@PostMapping("/deleteproduct/{id}")
	public void deleteProduct(@PathVariable Integer id) {
		ps.deleteProduct(id);
	}
	
	@PutMapping("/updateproduct/{id}")
	public Product updateProduct(@RequestBody Product newproduct, @PathVariable Integer id) {
		return ps.updateProduct(newproduct, id);
	}
	
	
}

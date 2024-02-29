package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.servicenterface.ServiceInterface;

@Service
public class ProductService implements ServiceInterface {

	@Autowired
	ProductRepository pr;
	
	
	public String getMassege() {
		return "Welcome to new Project";
	}
	

	public List<Product> getProducts(){
		return (List<Product>)pr.findAll();
	}
	
	
	public Optional<Product> getProductById(Integer id){
		return pr.findById(id);
	}
	
	
//	public List<Product> getProductByName(String name){
//		return (List<Product>) pr.findByProductName(name);
//	}
	
	
//	public List<Product> getProductByPrice(double price){
//		return (List<Product>)pr.findByProductPrice(price);
//	}
	
	
	public void addProduct(Product prod) {
		pr.save(prod);
	}
	
	
	public void deleteProduct(Integer id) {
		pr.deleteById(id);
	}
	
	
	public Product updateProduct( Product newproduct,  Integer id) {
		return pr.findById(id).map(product -> {
			product.setProdname(newproduct.getProdname());
			product.setProdprice(newproduct.getProdprice());
			return pr.save(product);
		}).orElseGet(() -> {
			return pr.save(newproduct);
		});
	}


	@Override
	public List<Product> getProductByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Product> getProductByPrice(double price) {
		// TODO Auto-generated method stub
		return null;
	}
}

package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "prodresttest")
public class Product {

	@Id
	private int prodid;
	@Column(length = 20)
	private String prodname;
	private double prodprice;
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public String getProdname() {
		return prodname;
	}
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	public double getProdprice() {
		return prodprice;
	}
	public void setProdprice(double prodprice) {
		this.prodprice = prodprice;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int prodid, String prodname, double prodprice) {
		super();
		this.prodid = prodid;
		this.prodname = prodname;
		this.prodprice = prodprice;
	}
	@Override
	public String toString() {
		return "Product Details :-\nProduct ID : " + prodid + "\nProduct Name : " + prodname + "\nProduct Price : " + prodprice ;
	}
	
	
	
}

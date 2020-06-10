package com.example.spring.jpa.JPADemo.User;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ProductDetail")
public class ProductDetail {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="productInformation")
	private String productInformation;
	
	

	public ProductDetail() {
		super();
	}



	public ProductDetail(String productInformation) {
		super();
		this.productInformation = productInformation;
	}



	public String getProductInformation() {
		return productInformation;
	}



	public void setProductInformation(String productInformation) {
		this.productInformation = productInformation;
	}



	public int getId() {
		return id;
	}



	@Override
	public String toString() {
		return "ProductDetail [id=" + id + ", productInformation=" + productInformation + "]";
	}
	
	

}

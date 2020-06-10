package com.example.spring.jpa.JPADemo.User;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name="product")
public class Product {
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	@Column(name="id")
	private int productId;
	
	@Column(name="productName")
	@NotNull(message="name required to full fill the request")
	private String productName;
	
	@Column(name="customerName")
	private String customerName;
	
	@Column(name="salary")
	@NotNull
	private double salary;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="pd_fk", referencedColumnName="id")
	private ProductDetail productDetail;
	
	public Product(){}

	public Product(String productName, String customerName, double salary) {
		super();
		this.productName = productName;
		this.customerName = customerName;
		this.salary = salary;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getProductId() {
		return productId;
	}

	

	public void setSalary(double salary) {
		this.salary = salary;
	}
	

	public ProductDetail getProductDetail() {
		return productDetail;
	}

	public void setProductDetail(ProductDetail productDetail) {
		this.productDetail = productDetail;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", customerName=" + customerName
				+ ", salary=" + salary + "]";
	}
	
	
	public double getSalary() {
		return salary;
	}

}

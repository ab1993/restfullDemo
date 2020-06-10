package com.example.spring.jpa.JPADemo.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.jpa.JPADemo.Repo.ProductRepo;
import com.example.spring.jpa.JPADemo.User.Product;
import com.example.spring.jpa.JPADemo.User.ProductDetail;

@Service
public class ProductService {
	
	@Autowired
	ProductRepo productRepo;
	
  /*public List<Product> getAllProducts()
  {
	  List<Product> products = new ArrayList<Product>();
	  products.add(new Product("Gym machine", "Abhishek"));
	  products.add(new Product("Facewash", "Bhanu"));
	  products.add(new Product("Car", "Sneha"));
	  products.add(new Product("Soda", "Anirudh"));
	  return products;
  }*/
	
	
	public List<Product> getAllProducts(Comparator<Product> com)
	{
		  return productRepo.findAll();
	}
	
	public Product load(Product product)
	{
		ProductDetail pd = new ProductDetail();
		pd.setProductInformation("this is the first");
		return productRepo.save(product);
	}
	
	// delete by id
	
	public void deleteProductByID(int id)
	{
		productRepo.deleteById(id);
	}
	
//	public Product update(Product product)
//	{
//		return productRepo.
//	}
  
//  public List<Product> getProductById(int id)
//  {
//	 List<E>
//	  return pr;
//  }
//	  
 
  
}

package com.example.spring.jpa.JPADemo;

import java.util.Comparator;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.internal.IgnoreForbiddenApisErrors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.jpa.JPADemo.Service.ProductService;
import com.example.spring.jpa.JPADemo.User.Product;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(value="Product controller API")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@GetMapping("/products")
	@ApiOperation("Get all the product data")
	@ApiResponses(value= {@ApiResponse(code=200,message="Success", response=Product.class),
			              @ApiResponse(code= 100,message="OK",response=Product.class)})
	public List<Product> getProduct(){
		
		Comparator<Product> com= new Comparator<Product>() {
			
			@Override
			public int compare(Product p1, Product p2) {
				if(p1.getSalary() < p2.getSalary())
				{
					return -1;
				}
				else
				{
					return 1;
				}
				
			}
		};
		
		return productService.getAllProducts(com);
	}
	
	@PostMapping("/addProduct")
	@ResponseBody
	@ApiOperation("Add the product")
	@ApiResponses(value= {@ApiResponse(code=200,message="Success", response=Product.class)})
	public ResponseEntity<Product> saveProduct(@Valid @NotNull @RequestBody Product product){
		
		 productService.load(product);
		 
		 return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@PutMapping("/updateProduct")
	@ResponseBody
	@ApiOperation("Update the product")
	@ApiResponses(value= {@ApiResponse(code=200,message="Success", response=Product.class)})
	public ResponseEntity<Product> updateProduct(@RequestBody Product product){
		
		  productService.load(product);
		  
		  return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteProduct/{id}")
	@ApiOperation("Delete the product")
	@ApiResponses(value= {@ApiResponse(code=200,message="Success", response=Product.class)})
	public ResponseEntity<Object> deleteProduct(@PathVariable("id")  @RequestBody int id){
		
		 productService.deleteProductByID(id);
		 
		 return new ResponseEntity<Object>(HttpStatus.OK);
	}
	
	
	/*@GetMapping("/product/{id}")
	@ApiOperation("Get the product by ID")
	@ApiResponses(value={@ApiResponse(code= 200,message="Success",response=Product.class),
			             @ApiResponse(code= 100,message="OK",response=Product.class)})
	public List<Product> getProductById(@PathVariable("id") int id)
	{
		return productService.getProductById(id);
	}*/
}

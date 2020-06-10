package com.example.spring.jpa.JPADemo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.jpa.JPADemo.Service.UserService;
import com.example.spring.jpa.JPADemo.User.Product;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@Api(value="User controller API")
public class UserController {
	
	private static final Logger log= LoggerFactory.getLogger(JpaDemoApplication.class);
	@Autowired
	UserService userService;
	
	@GetMapping("/users")
	@ApiOperation("Get all the users")
	@ApiResponses(value= {@ApiResponse(code=200,message="Success", response=Product.class),
			              @ApiResponse(code= 100,message="OK",response=Product.class)})
	public String getProduct(){
		
		return userService.getUser();
		
	}
	
	

}

package com.example.spring.jpa.JPADemo;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;

import java.util.Collection;
import java.util.Collections;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.example.spring.jpa.JPADemo.Service.ProductService;
import com.google.common.net.MediaType;

import springfox.documentation.service.MediaTypes;

@RunWith(SpringRunner.class)
@WebMvcTest
public class ProductControllerTest {
	
	/*@Autowired
	 MockMvc mockMvc; 
	
	@MockBean
	ProductService productService;  */
	
//	@Before
//	public void setUp() throws Exception
//	{
//		mockMvc= MockMvcBuilders.standaloneSetup(productController).build();
//		
//	}
	
//	@Test
//	public void testGetAllProduct() throws Exception
//	{
//		Mockito.when(productService.getAllProducts()).thenReturn(
//				Collections.emptyList());
//		MockMvc mockmvc=mockMvc.perform(MockMvcRequestBuilders.get("/products").accept(Med)	}
//		
//		
	}
		
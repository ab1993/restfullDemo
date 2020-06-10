package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.example.spring.jpa.JPADemo.ProductController;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@PropertySource("classpath:swagger.properties")
@ComponentScan(basePackageClasses=ProductController.class)
@Configuration
public class SwaggerConfig {
	
	private static final String SWAGGER_API_VERSION="1.0";
	private static final String LICENSE_TEXT="LICENSE";
	private static final String DESCRIPTION="Restfull api for products";
	private static final String TITLE="Products Rest API";
	
	private ApiInfo apiInfo()
	{
		return new ApiInfoBuilder().title(TITLE).
				description(DESCRIPTION)
				.license(LICENSE_TEXT)
				.version(SWAGGER_API_VERSION).build();
	}
	
	@Bean
	public Docket productsAPI()
	{
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.pathMapping("/ProductApi")
				.select().paths(PathSelectors.regex("/api.*")).build();
					
	
	}

}

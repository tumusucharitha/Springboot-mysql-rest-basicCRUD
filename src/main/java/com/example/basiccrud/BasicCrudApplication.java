package com.example.basiccrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.basiccrud"})
public class BasicCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicCrudApplication.class, args);
	}

}

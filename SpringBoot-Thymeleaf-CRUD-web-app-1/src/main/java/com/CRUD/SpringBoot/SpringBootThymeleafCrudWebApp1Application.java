package com.CRUD.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "com.CRUD.SpringBoot," +  "com.CRUD.SpringBoot.Service")
public class SpringBootThymeleafCrudWebApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootThymeleafCrudWebApp1Application.class, args);
	}

}

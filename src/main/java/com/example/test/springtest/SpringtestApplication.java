package com.example.test.springtest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.test.springtest")
public class SpringtestApplication {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext annotationConfigApplicationContext = 
				new AnnotationConfigApplicationContext(SpringtestApplication.class)) {
			System.out.println("Application Context is up.");
		}
	}
}

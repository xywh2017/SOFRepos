package com.example;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringBootDisableWebEnvironmentApplication implements CommandLineRunner{
	
	
	public static void main(String[] args) throws Exception {
		
//		Method#1: Using SpringApplicationBuilder.
		
		SpringApplication springApplication = 
				new SpringApplicationBuilder()
				.sources(SpringBootDisableWebEnvironmentApplication.class)
				.web(false)
				.build();

		springApplication.run(args);
		
//--------------------------------------------------------		

//		Method#2: Using SpringBootDisableWebEnvironmentApplication.		
		
//		SpringBootDisableWebEnvironmentApplication springBootDisableWebEnvironmentApplication = 
//				new SpringBootDisableWebEnvironmentApplication();
//		springBootDisableWebEnvironmentApplication.run(args);
		
//--------------------------------------------------------		
		
//		Method#3: Using SpringApplication().
		
//		SpringApplication springApplication = new SpringApplication();
//		springApplication.setWebEnvironment(false);
//		
//		Set<Object> sources = new HashSet<>();
//		sources.add(SpringBootDisableWebEnvironmentApplication.class);
//		springApplication.setSources(sources);
//		springApplication.run(args);
		
//--------------------------------------------------------	
				
	}

	@Override
	public void run(String... arg0) throws Exception {
		System.out.println("Hello, Spring Boot gives many options ;)");
	}
}

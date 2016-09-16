package com.rawsanj.bootjdbc;

import com.rawsanj.bootjdbc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootJdbcDemoApplication {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcDemoApplication.class, args);
	}

	@Bean
	CommandLineRunner getCommandLineRunner(){
		return args -> {
			userRepository.findAll().forEach(System.out::println);
		};
	}
}

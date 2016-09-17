package com.rawsanj.datalog;

import com.rawsanj.datalog.entity.User;
import com.rawsanj.datalog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringDataLogApplication {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataLogApplication.class, args);
	}

	@Bean
	CommandLineRunner getConCommandLineRunner(){
		return args -> {

			User user1 = new User("Sanjay", "sanjraw@gmail.com");
			User user2 = new User("Sandy", "sandy@gmail.com");
			User user3 = new User("Sanjay", "sanjay123@gmail.com");
			User user4 = new User("Sandy", "sandyyyy@gmail.com");

			List<User> users = Arrays.asList(user1,user2, user3, user4);
			userRepository.save(users);

			userRepository.getListOfUserByName("Sanjay").forEach(System.out::println);
			userRepository.getListOfUserByName("Sandy").forEach(System.out::println);
		};
	}
}

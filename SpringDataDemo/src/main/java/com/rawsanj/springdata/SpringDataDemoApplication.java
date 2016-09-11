package com.rawsanj.springdata;

import com.rawsanj.springdata.entity.Counter;
import com.rawsanj.springdata.repository.CounterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringDataDemoApplication {

	@Autowired
	private CounterService counterService;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataDemoApplication.class, args);
	}

	@Bean
	CommandLineRunner getCommandLineRunner(){
		return args -> {
			// Add some data;
			Counter cnt1= new Counter("Physics", 90);
			Counter cnt2= new Counter("Chemistry", 92);
			Counter cnt3= new Counter("Maths", 95);
			List<Counter> counters = Arrays.asList(cnt1, cnt2, cnt3);
			counterService.saveAll(counters);
			counterService.findAll().forEach(System.out::println);

			System.out.println("Last Inserted Id:  "+counterService.getLastInsterted());

			Counter phyOriginal = counterService.findOneByName("Physics");

			// Increment value by Native SQL
			System.out.println("Count Updated for No of rows: "+ counterService.updateCounterByName("Physics"));
			Counter phyUpdated = counterService.findOneByName("Physics");

			// Increment value by Native SQL
			System.out.println("Count Updated for No of rows: "+ counterService.updateCounterByName("Physics"));
			Counter phyLatest = counterService.findOneByName("Physics");

			System.out.println("Original Value of Physics: "+ phyOriginal.getValue()
								+"\nUpdated Value of Physics: "+ phyUpdated.getValue()
								+"\nLatest Value of Physics: "+ phyLatest.getValue());

			System.out.println("Last Inserted Id:  "+counterService.getLastInsterted());
		};
	}
}

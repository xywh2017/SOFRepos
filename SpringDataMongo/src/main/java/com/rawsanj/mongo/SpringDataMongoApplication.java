package com.rawsanj.mongo;

import com.rawsanj.mongo.entity.Company;
import com.rawsanj.mongo.entity.Job;
import com.rawsanj.mongo.repository.CompanyRepository;
import com.rawsanj.mongo.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringDataMongoApplication {

	private CompanyRepository companyRepository;

	private JobRepository jobRepository;

	@Autowired
	public SpringDataMongoApplication(CompanyRepository companyRepository, JobRepository jobRepository) {
		this.companyRepository = companyRepository;
		this.jobRepository = jobRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDataMongoApplication.class, args);
	}

	@Bean
	CommandLineRunner getCommandLineRunner(){
		return strings -> {
            // Create Jobs
			Job java = new Job("Core Java Developer");
			Job spring = new Job("Spring Web Developer");
			Job cSharp = new Job("C# Developer");
			Job dotNet = new Job(".Net Web Developer");
			List<Job> allJobs = Arrays.asList(java,cSharp,spring, dotNet);
            // Save All Jobs
			jobRepository.save(allJobs);

            // Create Companies
			Company oracle = new Company("Oracle", Arrays.asList(java));
			Company microsoft = new Company("Microsoft", Arrays.asList(cSharp, dotNet));
            Company pivotal = new Company("Pivotal", Arrays.asList(java, spring));
            // Save all companies
			companyRepository.save(Arrays.asList(oracle,microsoft,pivotal));

            // Display all Companies with Jobs
            System.out.println("*******************************************");
            companyRepository.findAll().forEach(System.out::println);
            System.out.println("*******************************************");

            // Find job by name - C#
            Job cSharpJob = jobRepository.findOneByName("C# Developer");
            System.out.println("*******************Found Job by Name************************");
            System.out.println(cSharpJob);
            System.out.println("*******************************************");

            // Find job by name - C#
            Job coreJavaJob = jobRepository.findOneByName("Core Java Developer");
            System.out.println("*******************Found Job by Name************************");
            System.out.println(coreJavaJob);
            System.out.println("*******************************************");

            // Find One Company having Job with Job Id - C#
            Company companyWithcSharpJob = companyRepository.findOneByJobId(cSharpJob.getId());
            System.out.println("********************Company having C# Job found using Job Id: "+ cSharpJob.getId() +"***********************");
            System.out.println(companyWithcSharpJob.getName());
            System.out.println("*******************************************");

            // Find All Companies having Job with Job Id - Core Java
            List<Company> companiesWithCorejavaJob = companyRepository.findByJobId(coreJavaJob.getId());
            System.out.println("********************Companies having Core Java Job found using Job Id: "+ coreJavaJob.getId() +"***********************");
            companiesWithCorejavaJob.forEach(c-> System.out.println(c.getName()));
            System.out.println("*******************************************");

        };
	}
}

package com.loollab.data_structures;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class DataStructuresApplication {


	public static void main(String[] args) {
		SpringApplication.run ( DataStructuresApplication.class, args );

	}

	@Bean
	public CommandLineRunner cmdRunner() {

		return args -> {
			System.out.println("Command Line Runner !");
		};

	}

}

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.tuyano.springboot.repositories")
public class MyBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyBootAppApplication.class, args);
	}
}

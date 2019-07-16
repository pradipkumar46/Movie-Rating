package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MoviRatingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviRatingApplication.class, args);
	}

}

package com.rajesh.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDockerJenkinsApplication {

	public static void main(String[] args) {
		System.out.println("Hello Jenkins");
		System.out.println("Second time checking Jenkins");
		SpringApplication.run(SpringbootDockerJenkinsApplication.class, args);
	}

}

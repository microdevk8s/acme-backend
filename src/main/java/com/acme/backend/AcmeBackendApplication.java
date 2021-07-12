package com.acme.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AcmeBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcmeBackendApplication.class, args);
	}

}

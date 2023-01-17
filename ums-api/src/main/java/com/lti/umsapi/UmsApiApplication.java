package com.lti.umsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UmsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(UmsApiApplication.class, args);
	}

}

package com.luocx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class ServiceregistorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceregistorApplication.class, args);
	}
}

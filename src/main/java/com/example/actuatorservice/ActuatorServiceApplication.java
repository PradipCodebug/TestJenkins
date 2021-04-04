package com.example.actuatorservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class ActuatorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActuatorServiceApplication.class, args);
	}

}

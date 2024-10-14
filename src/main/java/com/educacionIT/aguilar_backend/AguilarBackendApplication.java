package com.educacionIT.aguilar_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.educacionIT.entity")
public class AguilarBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(AguilarBackendApplication.class, args);
	}

}

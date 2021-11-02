package com.example.LibraryManagement;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LibraryManagementApplication {

	@Bean
	public ObjectMapper objectMapper(){return new ObjectMapper();}

	public static void main(String[] args) {
		SpringApplication.run(LibraryManagementApplication.class, args);
	}
}

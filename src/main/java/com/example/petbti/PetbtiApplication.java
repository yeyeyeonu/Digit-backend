package com.example.petbti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class PetbtiApplication {
	public static void main(String[] args) {
		SpringApplication.run(PetbtiApplication.class, args);
	}
}

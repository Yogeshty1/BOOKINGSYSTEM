package com.booking.bookingsystem;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookingsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingsystemApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo() {
		return args -> {
			System.out.println("Application has started successfully!");
			// Optional: Add database check or initialization logic here
		};
	}
}

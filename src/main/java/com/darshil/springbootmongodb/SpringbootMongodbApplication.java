package com.darshil.springbootmongodb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

@SpringBootApplication
public class SpringbootMongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMongodbApplication.class, args);
	}

//	@Bean
//	CommandLineRunner runner(StudentRepository repository) {
//		return args -> {
//			Address address = new Address(
//					"England",
//					"London",
//					"NW9"
//			);
//			String email = "jahmed@gmail.com";
//			Student student = new Student(
//					"Jamila",
//					"Ahmed",
//					email,
//					Gender.FEMALE,
//					address,
//					List.of("Computer Science"),
//					BigDecimal.TEN,
//					LocalDateTime.now()
//			);
//
//			repository.findStudentByEmail(email)
//						.ifPresentOrElse(s -> System.out.println(s + " already exists"),
//								() -> {
//							System.out.println("Inserting User with email " + email);
//							repository.insert(student);
//						});
//
//		};
//	}
}

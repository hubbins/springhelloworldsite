package com.morningstar.uim.example.springhelloworldsite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringhelloworldsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringhelloworldsiteApplication.class, args);
	}

	@RestController
	public class HelloController {

		@GetMapping("/")
		public String index() {
			return "Greetings from Spring Boot!";
		}

	}
}

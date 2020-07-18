package com.docker.bootdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BootDockerApplication {

	@GetMapping("/message")
	public String getMessage() {
		return "Welcome from Boot-Docker";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(BootDockerApplication.class, args);
	}

}

package com.example.jdk8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.IntStream;

@SpringBootApplication
@RestController
public class Jdk8Application {

	public static void main(String[] args) {
		SpringApplication.run(Jdk8Application.class, args);
	}

	@GetMapping("/")
	public void receiveSignal(){
		IntStream.rangeClosed(1, 1000).forEach(n -> Math.random());
	}
}

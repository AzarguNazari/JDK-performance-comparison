package com.example.jdk17;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.IntStream;

@SpringBootApplication
@RestController
public class Jdk17Application {

	public static void main(String[] args) {
		SpringApplication.run(Jdk17Application.class, args);
	}

	@GetMapping("/")
	public void receiveSignal(){
		IntStream.rangeClosed(1, 1000).forEach(n -> Math.random());
	}
}

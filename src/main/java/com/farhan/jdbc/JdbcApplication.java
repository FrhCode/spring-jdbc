package com.farhan.jdbc;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.uuid.Generators;

@SpringBootApplication
@RestController
@RequestMapping(path = "/api/v1")
public class JdbcApplication {

	@GetMapping
	public UUID index() {
		UUID uuid = Generators.timeBasedEpochGenerator().generate(); // Version 7

		return uuid;
	}

	public static void main(String[] args) {
		SpringApplication.run(JdbcApplication.class, args);
	}

}

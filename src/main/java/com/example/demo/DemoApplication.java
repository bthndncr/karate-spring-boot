package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws IOException {

		run(args);
	}

	public static ConfigurableApplicationContext run(String[] args) {
		return SpringApplication.run(DemoApplication.class, args);
	}

}

package com.coderscampus.assignment10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class Assignment10Application {

	public static void main(String[] args) {
		SpringApplication.run(Assignment10Application.class, args);
	}

}

package com.coderscampus.assignment10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Assignment10Application {

	public static void main(String[] args) {
		SpringApplication.run(Assignment10Application.class, args);
	}

}
//api key 700e9a8811454149bcb551d8ee52aff5
/**
 * Params: 
 * timeFrame type String example day/week
 * targetCalories: number/integer 2000 caloric target for the day
 * diet type String ex vegetarian 
 * exclude type String ex shellfish/olives 
 * quereyParam("apikey", "700e9a8811454149bcb551d8ee52aff5")
 * 
 * 
 * /
 */

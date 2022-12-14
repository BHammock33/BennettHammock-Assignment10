package com.coderscampus.assignment10.web;

import java.net.URI;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus.assignment10.dto.DayResponse;
import com.coderscampus.assignment10.dto.WeekResponse;

@RestController
public class PlanController {

//
//	String Key = "700e9a8811454149bcb551d8ee52aff5";
//	(defaultValue ="700e9a8811454149bcb551d8ee52aff5");
	 //@RequestParam String apiKey
	
	@GetMapping("mealplanner/week")
	public ResponseEntity<WeekResponse> getWeekMeals(@RequestParam(defaultValue = "week") Optional<String> time, @RequestParam("targetCalories") Optional<String> numCalories, @RequestParam Optional<String> diet,
			@RequestParam("exclude") Optional<String> exclusions) {
		RestTemplate rt = new RestTemplate();
		// https://api.spoonacular.com/mealplanner/generate?timeFrame=day

		URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
									  .queryParam( "apiKey", "700e9a8811454149bcb551d8ee52aff5")
									  .queryParamIfPresent("timeFrame", time)
									  .queryParamIfPresent("targetCalories",numCalories)
									  .queryParamIfPresent("diet", diet)
									  .queryParamIfPresent("exclude", exclusions)
									  .build()
									  .toUri();

		ResponseEntity<WeekResponse> response = rt.getForEntity(uri, WeekResponse.class);
		return response;
	}

	@GetMapping("mealplanner/day")
	public ResponseEntity<DayResponse> getDayMeals(@RequestParam(defaultValue = "day") Optional<String> time, @RequestParam("targetCalories") Optional<String> numCalories, @RequestParam Optional<String> diet,
			@RequestParam("exclude") Optional<String> exclusions) {

		RestTemplate rt = new RestTemplate();

		URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
									  .queryParam("apiKey", "700e9a8811454149bcb551d8ee52aff5" )
									  .queryParamIfPresent("timeFrame", time)
									  .queryParamIfPresent("targetCalories", numCalories)
									  .queryParamIfPresent("diet", diet)
									  .queryParamIfPresent("exclude", exclusions)
									  .build()
									  .toUri();

		ResponseEntity<DayResponse> response = rt.getForEntity(uri, DayResponse.class);
		return response;

	}

}

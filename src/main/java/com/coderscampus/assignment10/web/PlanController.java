package com.coderscampus.assignment10.web;

import java.net.URI;

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

	String Key = "700e9a8811454149bcb551d8ee52aff5";
	
	@GetMapping("mealplanner/week")
	public ResponseEntity<WeekResponse> getWeekMeals(@RequestParam("timeFrame") String time, @RequestParam("targetCalories") String numCalories, @RequestParam String diet,
			@RequestParam("exclude") String exclusions, @RequestParam String apiKey) {
		RestTemplate rt = new RestTemplate();
		// https://api.spoonacular.com/mealplanner/generate?timeFrame=day

		URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
									  .queryParam("timeFrame", time)
									  .queryParam("targetCalories", numCalories)
									  .queryParam("diet", diet)
									  .queryParam("exclude", exclusions)
									  .queryParam( apiKey, "700e9a8811454149bcb551d8ee52aff5")
									  .build()
									  .toUri();

		ResponseEntity<WeekResponse> response = rt.getForEntity(uri, WeekResponse.class);
		return response;
	}

	@GetMapping("mealplanner/day")
	public ResponseEntity<DayResponse> getDayMeals(@RequestParam("timeFrame") String time, @RequestParam("targetCalories") String numCalories, @RequestParam String diet,
			@RequestParam("exlude") String exclusions, @RequestParam String apiKey) {

		RestTemplate rt = new RestTemplate();

		URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
									  .queryParam("timeFrame", time)
									  .queryParam("targetCalories", numCalories)
									  .queryParam("diet", diet)
									  .queryParam("exclude", exclusions)
									  .queryParam("apiKey", Key )
									  .build()
									  .toUri();

		ResponseEntity<DayResponse> response = rt.getForEntity(uri, DayResponse.class);
		return response;

	}

}

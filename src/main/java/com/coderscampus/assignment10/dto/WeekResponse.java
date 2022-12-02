package com.coderscampus.assignment10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


public class WeekResponse {
	
//	@JsonProperty("meals")
//	private Meals meals;
//	
//	@JsonProperty("nutrients")
//	private Nutrients nutrients;
//	
	@JsonProperty("week")
	private Week week;
	
	public Week getWeek() {
		return week;
	}
	public void setWeek(Week week) {
		this.week=week;
	}
	@Override
	public String toString() {
		return "WeekResponse [week=" + week + "]";
	}

//	public Meals getMeals() {
//		return meals;
//	}
//
//	public void setMeals(Meals meals) {
//		this.meals = meals;
//	}
//
//	public Nutrients getNutrients() {
//		return nutrients;
//	}
//
//	public void setNutrients(Nutrients nutrients) {
//		this.nutrients = nutrients;
//	}
	

	
}

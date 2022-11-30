package com.coderscampus.assignment10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Nutrients {
	
	@JsonProperty("calories")
	private Integer calories;
	@JsonProperty("carbohydrates")
	private Integer carbs;
	@JsonProperty("fat")
	private Integer fat;
	@JsonProperty("protein")
	private Integer protein;
	public Integer getCalories() {
		return calories;
	}
	public void setCalories(Integer calories) {
		this.calories = calories;
	}
	public Integer getCarbs() {
		return carbs;
	}
	public void setCarbs(Integer carbs) {
		this.carbs = carbs;
	}
	public Integer getFat() {
		return fat;
	}
	public void setFat(Integer fat) {
		this.fat = fat;
	}
	public Integer getProtein() {
		return protein;
	}
	public void setProtein(Integer protein) {
		this.protein = protein;
	}
	
	

}

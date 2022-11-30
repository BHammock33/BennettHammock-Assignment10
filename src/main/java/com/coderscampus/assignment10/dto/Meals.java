package com.coderscampus.assignment10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Meals {
	
	@JsonProperty("id")
	private Integer Id;
	@JsonProperty("title")
	private String title;
	@JsonProperty("imageType")
	private String imgType;
	@JsonProperty("readyInMinutes")
	private Integer readyInMins;
	@JsonProperty("servings")
	private Integer servings;
	@JsonProperty("sourceUrl")
	private String sourceUrl;
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImgType() {
		return imgType;
	}
	public void setImgType(String imgType) {
		this.imgType = imgType;
	}
	public Integer getReadyInMins() {
		return readyInMins;
	}
	public void setReadyInMins(Integer readyInMins) {
		this.readyInMins = readyInMins;
	}
	public Integer getServings() {
		return servings;
	}
	public void setServings(Integer servings) {
		this.servings = servings;
	}
	public String getSourceUrl() {
		return sourceUrl;
	}
	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}

	
}

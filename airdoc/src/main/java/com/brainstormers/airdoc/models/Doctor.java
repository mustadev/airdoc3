package com.brainstormers.airdoc.models;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mongodb.lang.NonNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * le Model Doctor 
 * @author Mustapha De BrainStormers
 * @since 13-03-2020
 * 
 */
@ApiModel(description = "doctor details")
@Document(collection = "doctors")
public class Doctor{
	
	/**
	 * ID de Doctor
	 */
	@ApiModelProperty(notes = "Doctor ID")
	@Id
    private String id;

	/**
	 * nom de doctor
	 */
	@ApiModelProperty(notes = "nom de doctor")
	@NonNull
	private String name;

	/**
	 * description de doctor
	 */
	@ApiModelProperty(notes = "description de doctor")
    private String description;

	/**
	 * ville de doctor
	 */
	@ApiModelProperty(notes = "ville de doctor")
	@NonNull
    private String city;

	/**
	 * les revues de doctor
	 */
	@ApiModelProperty(notes = "les revues de doctor")
    private List<Review> reviews = new ArrayList<>();

	/**
	 * les services de doctor
	 */
	@ApiModelProperty(notes = "les services de doctor")
    private List<String> services;


	/**
	 * minPrice de doctor
	 */
	@ApiModelProperty(notes = "minPrice de doctor")
    private int minPrice = 0;

	/**
	 * maxPrice de doctor
	 */
	@ApiModelProperty(notes = "maxPrice de doctor")
    private int maxPrice = 0;
	
	/**
	 * pay de doctor
	 */
	@ApiModelProperty(notes = "pay de doctor")
    private String country = "";

	/**
	 * specialité de doctor
	 */
	@ApiModelProperty(notes = "specialité de doctor")
    private String speciality = "";


	/**
	 * propriétaire de doctor
	 */
	@ApiModelProperty(notes = "propriétaire de doctor")
	@NonNull
    private String ownerId; //TODO @NonNull not working properly

	/**
	 * Évaluation du Doctor
	 */
	@ApiModelProperty(notes = "Évaluation du Doctor")
    private float rating = 0.0f; //TODO set max 5.0 and min 0.0
	
	/**
	 * Nombre de évaluation du Doctor
	 */
	@ApiModelProperty(notes = "Évaluation du Doctor")
    private int averageRating = 0; //TODO set max 5.0 and min 0.0
	
	
    
    
	public List<String> getServices() {
		return services;
	}
	public void setServices(List<String> services) {
		this.services = services;
	}
	public int getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(int minPrice) {
		this.minPrice = minPrice;
	}
	public int getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(int maxPrice) {
		this.maxPrice = maxPrice;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public int getAverageRating() {
		return averageRating;
	}
	public void setAverageRating(int averageRating) {
		this.averageRating = averageRating;
	}
	public List<Review> getReviews() {
		return reviews;
	}
	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
	public String getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public String getId() {
	return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city= city;
	}
    
}

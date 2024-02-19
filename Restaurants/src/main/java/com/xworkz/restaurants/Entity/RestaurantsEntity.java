package com.xworkz.restaurants.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="restaurants_table")
public class RestaurantsEntity {
	@Id
	@Column(name="restaurants_id")
	private int id;
	@Column(name="restaurants_name")
	private String name;
	@Column(name="restaurants_location")
	private String location;
	@Column(name="restaurants_ratings")
	private float ratings;
	
}

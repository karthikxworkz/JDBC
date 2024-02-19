package com.xworkz.temples.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="temples_table")
public class TemplesEntity {

	@Id
	@Column(name="temples_id")
	private int id;
	@Column(name="temples_name")
	private String name;
	@Column(name="temples_place")
	private String place;
	@Column(name="temples_devoteeOf")
	private String devoteeOf;
	@Column(name="temples_state")
	private String State;
}

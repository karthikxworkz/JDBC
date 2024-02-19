package com.xworkz.occupation.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "occupation_table")
public class OccupationEntity {

	@Id
	@Column(name = "occupation_id")
	private int id;
	@Column(name = "occupation_name")
	private String name;
	@Column(name = "occupation_types")
	private int types;
	@Column(name = "occupation_branch")
	private String branch;

}

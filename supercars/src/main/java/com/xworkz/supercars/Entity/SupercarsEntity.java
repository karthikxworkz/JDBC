package com.xworkz.supercars.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="supercars_table")
@NamedQuery(name="findcolorbyname",query = "SELECT entity.color FROM SupercarsEntity entity WHERE entity.name=:nameby")
public class SupercarsEntity {
@Id
@Column(name="supercars_id")
	private int id;
@Column(name="supercars_name")
	private String name;
@Column(name="supercars_price")
	private int price;
@Column(name="supercars_company")
	private String company;
@Column(name="supercars_color")
	private String color;
	
}

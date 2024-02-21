package com.xworkz.crocs.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "crocs_table")
@NamedQuery(name = "findsbyname", query="SELECT entity FROM CrocsEntity entity WHERE entity.name=:nameby")
@NamedQuery(name = "findsbysize", query="SELECT entity FROM CrocsEntity entity WHERE entity.size=:sizeby")
@NamedQuery(name = "findsbysizeandname", query="SELECT entity FROM CrocsEntity entity WHERE entity.name=:nameby AND entity.size=:sizeby")
public class CrocsEntity {
	@Id
	private int id;
	private String name;
	private int price;
	private String color;
	private int size;

}

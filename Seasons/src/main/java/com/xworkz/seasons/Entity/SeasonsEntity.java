package com.xworkz.seasons.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="seasons_table")
@NamedQuery(name="UpdateByname",query="UPDATE SeasonsEntity entity SET entity.occur=:occurby WHERE entity.name=:nameby")
@NamedQuery(name="UpdateByid",query="UPDATE SeasonsEntity entity SET entity.charactersistics=:charactersisticsby WHERE entity.id=:idby")
@NamedQuery(name="UpdateByoccur",query="UPDATE SeasonsEntity entity SET entity.name=:nameby WHERE entity.occur=:occurby")
@NamedQuery(name="UpdateBycharactersistics",query="UPDATE SeasonsEntity entity SET entity.occur=:occurby WHERE entity.charactersistics=:charactersisticsby")

public class SeasonsEntity {

	@Id
	@Column (name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="occur")
	private String occur;
	@Column(name="charactersistics")
	private String charactersistics;
}

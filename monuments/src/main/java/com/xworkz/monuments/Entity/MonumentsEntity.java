package com.xworkz.monuments.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "monuments_table")

@NamedQuery(name = "UpdateByname", query = "UPDATE MonumentsEntity entity SET entity.city=cityby WHERE entity.name=:nameby")
@NamedQuery(name = "UpdateBycity", query = "UPDATE MonumentsEntity entity SET entity.name=:nameby WHERE entity.city=:cityby")
@NamedQuery(name = "UpdateBybestTimeToVisit", query = "UPDATE MonumentsEntity entity SET entity.builtBy=:builtByby WHERE entity.bestTimeToVisit=:bestTimeToVisitby")
@NamedQuery(name = "UpdateByid", query = "UPDATE MonumentsEntity entity SET entity.bestTimeToVisit=:bestTimeToVisitby WHERE entity.id=:idby")

public class MonumentsEntity {

	@Id
	@Column(name = "monuments_id")
	private int id;

	@Column(name = "monuments_name")
	private String name;

	@Column(name = "monuments_city")
	private String city;

	@Column(name = "monuments_besttimetovisit")
	private String bestTimeToVisit;

	@Column(name = "monuments_builtby")
	private String builtBy;
}


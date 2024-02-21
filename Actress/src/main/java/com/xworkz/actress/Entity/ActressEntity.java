package com.xworkz.actress.Entity;

import java.math.BigInteger;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="actress_table")
@NamedQuery(name="findsbyname" ,query="SELECT entity FROM ActressEntity entity WHERE entity.name=:nameby")
@NamedQuery(name="findsbynoOfMovies" ,query="SELECT entity FROM ActressEntity entity WHERE entity.name=:nameby")
@NamedQuery(name="findsbynameandnoOfMovies" ,query="SELECT entity FROM ActressEntity entity WHERE entity.name=:nameby AND entity.noOfMovies=:noOfMoviesby")
public class ActressEntity {

	@Id
	private int id;
	private String name;
	private int noOfMovies;
	private BigInteger phonenumber;
	private int age;
}

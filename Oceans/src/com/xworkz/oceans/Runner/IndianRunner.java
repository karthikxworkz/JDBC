package com.xworkz.oceans.Runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.oceans.Dto.OceansDto;

public class IndianRunner {

public static void main(String[] args) {
		
		OceansDto oceansDto=new OceansDto();
		oceansDto.setName("Indian Ocean");
		oceansDto.setDepth(4800);
		oceansDto.setBorders("East Africa");
		oceansDto.setCoveredPercentage(20);
		
		String query = "INSERT INTO oceans_table(oceans_name,oceans_depth,oceans_borders,oceans_coveredPercentage) Values(?,?,?,?)";
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/oceans", "root",
				"Xworkzodc@123"); 
				PreparedStatement preparedStatement = connection.prepareStatement(query)) {
			System.out.println("Successfully Running");
			preparedStatement.setString(1, oceansDto.getName());
			preparedStatement.setInt(2, oceansDto.getDepth());
			preparedStatement.setString(3, oceansDto.getBorders());
			preparedStatement.setInt(4, oceansDto.getCoveredPercentage());
			
			preparedStatement.executeUpdate();
			System.out.println("Inserting");
		} catch (SQLException e) {
			System.out.println("Exception:" + e);
		}

	}

	} 
	


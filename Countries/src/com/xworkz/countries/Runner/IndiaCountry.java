package com.xworkz.countries.Runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.countries.Constants.ConnectionData;

public class IndiaCountry {

	public static void main(String[] args) {
			String query ="INSERT INTO countries_Info(country_Id, country_Name ,country_Population ,country_NoOfStates ,country_PM ) Values(?,?,?,?,?)";
	
			try (Connection connection = DriverManager.getConnection(ConnectionData.URl.getValue(),
					ConnectionData.USERNAME.getValue(), ConnectionData.PASSWORD.getValue());
					PreparedStatement preparedStatment = connection.prepareStatement(query)) {
	       
				System.out.println("Successfully Connected");
				preparedStatment.setInt(1,1);
				preparedStatment.setString(2, "India");
				preparedStatment.setInt(3, 15667789);
				preparedStatment.setInt(4, 29);
				preparedStatment.setString(5, "Narendra Modi");
				preparedStatment.executeUpdate();
				System.out.println("Inserting");
				
			}catch(SQLException e) {
				System.out.println("Not Connected Successfully");
				e.printStackTrace();
			}
	
		}
	}
	
	


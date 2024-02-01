package com.xworkz.fruits.Runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.fruits.Constants.ConnectionData;

public class StrawaberryFruits {
	public static void main(String[] args) {
		String query ="INSERT INTO fruits_Info(fruits_Id ,fruits_Name,fruits_cost,fruits_Region) Values(?,?, ?,?)";

		try (Connection connection = DriverManager.getConnection(ConnectionData.URl.getValue(),
				ConnectionData.USERNAME.getValue(), ConnectionData.PASSWORD.getValue());
				PreparedStatement preparedStatment = connection.prepareStatement(query)) {
       
			System.out.println("Successfully Connected");
			preparedStatment.setInt(1,6);
			preparedStatment.setString(2, "StrawBerry");
			preparedStatment.setInt(3, 300);
			preparedStatment.setString(4,"UttarPradesh");
			preparedStatment.executeUpdate();
			System.out.println("Inserting");
			
		}catch(SQLException e) {
			System.out.println("Not Connected Successfully");
			e.printStackTrace();
		}

	}

}

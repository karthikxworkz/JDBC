package com.xworkz.fruits.Runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.fruits.Constants.ConnectionData;

public class WatermelonFruits {
	
	public static void main(String[] args) {
		String query ="INSERT INTO fruits_Info(fruits_Id ,fruits_Name,fruits_cost,fruits_Region) Values(?,?, ?,?)";

		try (Connection connection = DriverManager.getConnection(ConnectionData.URl.getValue(),
				ConnectionData.USERNAME.getValue(), ConnectionData.PASSWORD.getValue());
				PreparedStatement preparedStatment = connection.prepareStatement(query)) {
       
			System.out.println("Successfully Connected");
			preparedStatment.setInt(1,4);
			preparedStatment.setString(2, "Watermelon");
			preparedStatment.setInt(3, 265);
			preparedStatment.setString(4,"AndhraPradesh");
			preparedStatment.executeUpdate();
			System.out.println("Inserting");
			
		}catch(SQLException e) {
			System.out.println("Not Connected Successfully");
			e.printStackTrace();
		}

	}

}

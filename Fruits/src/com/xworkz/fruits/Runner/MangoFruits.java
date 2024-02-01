package com.xworkz.fruits.Runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.fruits.Constants.ConnectionData;

public class MangoFruits {
	public static void main(String[] args) {
		String query ="INSERT INTO fruits_Info(fruits_Id ,fruits_Name,fruits_cost,fruits_Region) Values(?,?, ?,?)";

		try (Connection connection = DriverManager.getConnection(ConnectionData.URl.getValue(),
				ConnectionData.USERNAME.getValue(), ConnectionData.PASSWORD.getValue());
				PreparedStatement preparedStatment = connection.prepareStatement(query)) {
       
			System.out.println("Successfully Connected");
			preparedStatment.setInt(1,3);
			preparedStatment.setString(2, "Mango");
			preparedStatment.setInt(3, 255);
			preparedStatment.setString(4,"Karantaka");
			preparedStatment.executeUpdate();
			System.out.println("Inserting");
			
		}catch(SQLException e) {
			System.out.println("Not Connected Successfully");
			e.printStackTrace();
		}

	}

}

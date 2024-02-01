package com.xworkz.charger.Runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.charger.Constants.ConnectionData;

public class AppleCharger {

	public static void main(String[] args) {
		String query ="INSERT INTO charger_Info(charger_Id,companyName,price,modelName,colour) Values(?,?, ?, ?, ?)";

		try (Connection connection = DriverManager.getConnection(ConnectionData.URl.getValue(),
				ConnectionData.USERNAME.getValue(), ConnectionData.PASSWORD.getValue());
				PreparedStatement preparedStatment = connection.prepareStatement(query)) {
       
			System.out.println("Successfully Connected");
			preparedStatment.setInt(1,2);
			preparedStatment.setString(2, "Apple20W");
			preparedStatment.setInt(3, 2000);
			preparedStatment.setString(4,"a2344");
			preparedStatment.setString(5, "White");
			preparedStatment.executeUpdate();
			System.out.println("Inserting");
			
		}catch(SQLException e) {
			System.out.println("Not Connected Successfully");
			e.printStackTrace();
		}

	}

}

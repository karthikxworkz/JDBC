package com.xworkz.charger.Runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.charger.Constants.ConnectionData;

public class MICharger {
	public static void main(String[] args) {
		String query ="INSERT INTO charger_Info(charger_Id,companyName,price,modelName,colour) Values(?,?, ?, ?, ?)";

		try (Connection connection = DriverManager.getConnection(ConnectionData.URl.getValue(),
				ConnectionData.USERNAME.getValue(), ConnectionData.PASSWORD.getValue());
				PreparedStatement preparedStatment = connection.prepareStatement(query)) {
       
			System.out.println("Successfully Connected");
			preparedStatment.setInt(1,3);
			preparedStatment.setString(2, "MI20W");
			preparedStatment.setInt(3, 2000);
			preparedStatment.setString(4,"M2344");
			preparedStatment.setString(5, "Black");
			preparedStatment.executeUpdate();
			System.out.println("Inserting");
			
		}catch(SQLException e) {
			System.out.println("Not Connected Successfully");
			e.printStackTrace();
		}

	}


}

package com.xworkz.content.Runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.content.Constants.ConnectionData;

public class SuspenseContent {
	public static void main(String[] args) {
		String query ="INSERT INTO content_Info(content_Id,content_type ,content_timings) Values(?,?, ?)";

		try (Connection connection = DriverManager.getConnection(ConnectionData.URl.getValue(),
				ConnectionData.USERNAME.getValue(), ConnectionData.PASSWORD.getValue());
				PreparedStatement preparedStatment = connection.prepareStatement(query)) {
       
			System.out.println("Successfully Connected");
			preparedStatment.setInt(1,5);
			preparedStatment.setString(2, "Suspense");
			preparedStatment.setInt(3, 8);
			preparedStatment.executeUpdate();
			System.out.println("Inserting");
			
		}catch(SQLException e) {
			System.out.println("Not Connected Successfully");
			e.printStackTrace();
		}

	}




}

package com.xworkz.oceans.Update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.oceans.Dto.OceansDto;

public class AtlanticUpdate {
	
	public static void main(String[] args) {
		String updateQuery = "UPDATE oceans_table SET oceans_name = ? WHERE oceans_id = ?";
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/oceans", "root",
				"Xworkzodc@123"); PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {
			System.out.println("Successfully Running");
			preparedStatement.setString(1,"AtlanticOcean");
			preparedStatement.setInt(2, 1);


			 int rowsAffected = preparedStatement.executeUpdate();
	         System.out.println(rowsAffected + " rows updated successfully");
		} catch (SQLException e) {
			System.out.println("Exception:" + e);
			e.printStackTrace();
		}
		}

	}



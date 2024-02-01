package com.xworkz.richPerson.Runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.richPerson.Constants.ConnectionData;

public class RichPersonCyrusPonawalla {
	
	public static void main(String[] args) {
		String query ="INSERT INTO  richPerson_Info(richPerson_Id,richPerson_Name ,richPerson_Age,richPerson_Worth) Values(?,?,?,?)";

		try (Connection connection = DriverManager.getConnection(ConnectionData.URl.getValue(),
				ConnectionData.USERNAME.getValue(), ConnectionData.PASSWORD.getValue());
				PreparedStatement preparedStatment = connection.prepareStatement(query)) {
       
			System.out.println("Successfully Connected");
			preparedStatment.setInt(1,5);
			preparedStatment.setString(2, "Cyrus Ponallawa");
			preparedStatment.setInt(3, 67);
			preparedStatment.setInt(4, 253);
			preparedStatment.executeUpdate();
			System.out.println("Inserting");
			
		}catch(SQLException e) {
			System.out.println("Not Connected Successfully");
			e.printStackTrace();
		}

	}

}

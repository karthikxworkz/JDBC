package com.xworkz.richPerson.Runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.richPerson.Constants.ConnectionData;

public class RichPersonMukeshAmbani {
	
	public static void main(String[] args) {
		String query ="INSERT INTO  richPerson_Info(richPerson_Id,richPerson_Name ,richPerson_Age,richPerson_Worth) Values(?,?,?,?)";

		try (Connection connection = DriverManager.getConnection(ConnectionData.URl.getValue(),
				ConnectionData.USERNAME.getValue(), ConnectionData.PASSWORD.getValue());
				PreparedStatement preparedStatment = connection.prepareStatement(query)) {
       
			System.out.println("Successfully Connected");
			preparedStatment.setInt(1,1);
			preparedStatment.setString(2, "Mukesh ambani");
			preparedStatment.setInt(3, 65);
			preparedStatment.setInt(4, 1095);
			preparedStatment.executeUpdate();
			System.out.println("Inserting");
			
		}catch(SQLException e) {
			System.out.println("Not Connected Successfully");
			e.printStackTrace();
		}

	}

}

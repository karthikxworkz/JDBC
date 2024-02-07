package com.xworkz.todayTest.Runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;

//import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

import com.mysql.cj.xdevapi.PreparableStatement;
import com.xworkz.todayTest.Constants.ConnectionData;

public class ProductName {
	
	public static void main(String[] args) {
		
			String query ="SELECT products_name,price FROM products WHERE products_name,price=?";

			try (Connection connection = DriverManager.getConnection(ConnectionData.URl.getValue(),
					ConnectionData.USERNAME.getValue(), ConnectionData.PASSWORD.getValue());
					PreparedStatement preparedStatment = connection.prepareStatement(query)) {
	       
				System.out.println("Successfully Connected");
				preparedStatment.setString(1,"Monkey777");
				preparedStatment.setInt(2, 100);
				preparedStatment.executeUpdate();
				System.out.println("Inserting");
				
			}catch(SQLException e) {
				System.out.println("Not Connected Successfully");
				e.printStackTrace();
			}
	}
}

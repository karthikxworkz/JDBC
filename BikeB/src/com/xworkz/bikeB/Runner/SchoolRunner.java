package com.xworkz.bikeB.Runner;

import java.sql.Connection;
import java.sql.DriverManager;

public class SchoolRunner {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/bike_database";
		String userName = "root";
		String password = "Xworkzodc@123";

		try (Connection collection1 = DriverManager.getConnection(url, userName, password)) {
			if (collection1 != null) {
				System.out.println("If save sucess");

			} else {
				System.out.println("If saved failed");

			}
		} catch (Exception o) {
			o.printStackTrace();
		}

	}
}
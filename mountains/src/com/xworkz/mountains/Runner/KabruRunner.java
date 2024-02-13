package com.xworkz.mountains.Runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.mountains.Dto.MountainsDto;

public class KabruRunner {

	public static void main(String[] args) {

		MountainsDto mountainsDto = new MountainsDto();
		mountainsDto.setName("Kabru");
		mountainsDto.setPeakName("kabru");
		mountainsDto.setLength(720);
		mountainsDto.setRegion("Kangchenjunga");
		mountainsDto.setBorders("India–Nepal borde");
		mountainsDto.setElevation(7412);
		mountainsDto.setRangeCoordination("27°38′06″N 88°07′06″E");

		String query = "INSERT INTO mountains_table(mountains_name,mountains_peakName,mountains_length,mountains_region,mountains_borders,mountains_elevation,mountains_rangeCoordination)Values(?,?,?,?,?,?,?)";
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mountains", "root",
				"Xworkzodc@123");
				PreparedStatement preparedStatement = connection.prepareStatement(query)) {
			System.out.println("Successfully Running");
			preparedStatement.setString(1, mountainsDto.getName());
			preparedStatement.setString(2, mountainsDto.getPeakName());
			preparedStatement.setInt(3, mountainsDto.getLength());
			preparedStatement.setString(4, mountainsDto.getRegion());
			preparedStatement.setString(5, mountainsDto.getBorders());
			preparedStatement.setInt(6, mountainsDto.getElevation());
			preparedStatement.setString(7, mountainsDto.getRangeCoordination());

			preparedStatement.executeUpdate();

			System.out.println("Inserting");
		} catch (SQLException e) {
			System.out.println("Exception:" + e);
		}
	}
}

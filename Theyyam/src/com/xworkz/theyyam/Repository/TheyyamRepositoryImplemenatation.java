package com.xworkz.theyyam.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.theyyam.Constants.ConnectionData;
import com.xworkz.theyyam.Dto.TheyyamDto;

public class TheyyamRepositoryImplemenatation implements TheyyamRepository {

	@Override
	public boolean onSave(TheyyamDto theyyamDto) {
		String query = "Insert Into theyyam_Table(theyyam_Id,origin,Country,typesOfTheyyam,anotherName,startMonth,endMonth,belongsFamilyName,originatedPeriods,devoteeOf) Values(?,?,?,?,?,?,?,?,?,?)";
		try (Connection connection = DriverManager.getConnection(ConnectionData.URl.getValue(),
				ConnectionData.USERNAME.getValue(), ConnectionData.PASSWORD.getValue());
				PreparedStatement preparedStatement = connection.prepareStatement(query)) {
			System.out.println("Sucessfully Connected");
               preparedStatement.setInt(1, theyyamDto.getTheyyam_Id());
               preparedStatement.setString(2, theyyamDto.getOrigin());
               preparedStatement.setString(3, theyyamDto.getCountry());
               preparedStatement.setInt(4, theyyamDto.getTypesOfTheyyam());
               preparedStatement.setString(5, theyyamDto.getAnotherName());
               preparedStatement.setString(6, theyyamDto.getStartMonth());
               preparedStatement.setString(7, theyyamDto.getEndMonth());
               preparedStatement.setString(8, theyyamDto.getBelongsFamilyName());
               preparedStatement.setString(9, theyyamDto.getOriginatedPeriods());
               preparedStatement.setString(10, theyyamDto.getDevoteeOf());
               
               preparedStatement.executeUpdate();
               System.out.println("inserting the values");
		} catch (SQLException e) {
			System.out.println("Not Sucessfully connected");
			e.printStackTrace();
			return true;
		}
		return true;
	}
}

package com.xworkz.soap.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.soap.Constants.ConnectionData;
import com.xworkz.soap.Dto.SoapDto;

public class SoapRepositoryImplementation implements SoapRepository{

	@Override
	public boolean onSave(SoapDto soapDto) {
		String query="Insert Into soap_Table(id,name,companyName,price,headQuater,owner,foundedDate,website,color,flavour) Values(?,?,?,?,?,?,?,?,?,?)";
		try (Connection connection = DriverManager.getConnection(ConnectionData.URl.getValue(),
				ConnectionData.USERNAME.getValue(), ConnectionData.PASSWORD.getValue());
				PreparedStatement preparedStatement = connection.prepareStatement(query)) {
			System.out.println("Sucessfully Connected");
			preparedStatement.setInt(1, soapDto.getId());
			preparedStatement.setString(2, soapDto.getName());
			preparedStatement.setString(3, soapDto.getCompanyName());
			preparedStatement.setInt(4, soapDto.getPrice());
			preparedStatement.setString(5, soapDto.getHeadQuater());
			preparedStatement.setString(6, soapDto.getOwner());
			preparedStatement.setString(7, soapDto.getFoundedDate());
			preparedStatement.setString(8, soapDto.getWebsite());
			preparedStatement.setString(9, soapDto.getColor());
			preparedStatement.setString(10, soapDto.getFlavour());
			
			preparedStatement.executeUpdate();
			 System.out.println("inserting the values");
		}catch(SQLException e) {
			System.out.println("Not Suceesfully connected");
			e.printStackTrace();
		}
		return true;
	}
}

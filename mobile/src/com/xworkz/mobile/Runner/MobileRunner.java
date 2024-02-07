package com.xworkz.mobile.Runner;

import java.sql.Connection;

import com.xworkz.mobile.constant.ConnectionData;
import com.xworkz.mobile.dto.MobileDto;
import com.xworkz.mobile.service.MobileService;
import com.xworkz.mobile.service.MobileServiceImpl;

public class MobileRunner {
	
	public static void main(String[] args) {
		ConnectionData.URL.setValue("jdbc:mysql://localhost:3306/mobile");
		ConnectionData.USERNAME.setValue("root");
		ConnectionData.PASSWORD.setValue("Xworkzodc@123");
		
		MobileService service=new MobileServiceImpl();
		MobileDto dto=new MobileDto("GooglePixil", 38000,"g011a");
		service.save(dto);
	}

}
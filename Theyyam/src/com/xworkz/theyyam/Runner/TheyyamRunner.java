package com.xworkz.theyyam.Runner;

import com.xworkz.theyyam.Dto.TheyyamDto;
import com.xworkz.theyyam.Service.TheyyamService;
import com.xworkz.theyyam.Service.TheyyamServiceImplementation;

public class TheyyamRunner {

	public static void main(String[] args) {
		
		TheyyamService service=new TheyyamServiceImplementation();
		TheyyamDto theyyamDto=new TheyyamDto();
		theyyamDto.setTheyyam_Id(1);
		theyyamDto.setOrigin("Kerala");
		theyyamDto.setCountry("India");
		theyyamDto.setTypesOfTheyyam(450);
		theyyamDto.setAnotherName("Kaliyattam");
		theyyamDto.setStartMonth("October");
		theyyamDto.setEndMonth("June");
		theyyamDto.setBelongsFamilyName("Thiyyar");
		theyyamDto.setOriginatedPeriods("Neolithic");
		theyyamDto.setDevoteeOf("Lord Vishnu");
		service.save(theyyamDto);
		
		System.out.println("Inserting the values in Runner");
		
	}
}

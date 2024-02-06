package com.xworkz.soap.Runner;

import com.xworkz.soap.Dto.SoapDto;
import com.xworkz.soap.Service.SoapService;
import com.xworkz.soap.Service.SoapServiceImplementation;

public class SoapRunner {
	
	public static void main(String[] args) {
		
		SoapService service=new SoapServiceImplementation();
		SoapDto soapDto=new SoapDto();
		soapDto.setId(1);
		soapDto.setName("Medimix");
		soapDto.setCompanyName("Medimix Ayurveda");
        soapDto.setHeadQuater("TamilNadu");
        soapDto.setOwner("	V. P. Sidhan");
        soapDto.setColor("Green");
        soapDto.setFoundedDate("1969");
        soapDto.setWebsite("https://www.medimixayurveda.com/");
        soapDto.setPrice(0);
        soapDto.setFlavour("Mint");
        
        System.out.println("Inserted elmenents :"+soapDto);
        service.save(soapDto);
		
	}

}

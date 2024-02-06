package com.xworkz.soap.Service;

import com.xworkz.soap.Dto.SoapDto;
import com.xworkz.soap.Repository.SoapRepository;
import com.xworkz.soap.Repository.SoapRepositoryImplementation;

public class SoapServiceImplementation implements SoapService {

	@Override
	public boolean save(SoapDto soapDto) {
		SoapRepository name =new SoapRepositoryImplementation();
		name.onSave(soapDto);
		return true;
	}

}

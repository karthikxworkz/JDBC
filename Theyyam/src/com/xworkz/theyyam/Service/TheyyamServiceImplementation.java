package com.xworkz.theyyam.Service;

import com.xworkz.theyyam.Dto.TheyyamDto;
import com.xworkz.theyyam.Repository.TheyyamRepository;
import com.xworkz.theyyam.Repository.TheyyamRepositoryImplemenatation;

public class TheyyamServiceImplementation implements TheyyamService{

	@Override
	public boolean save(TheyyamDto theyyamDto) {
		TheyyamRepository name = new TheyyamRepositoryImplemenatation();
		name.onSave(theyyamDto);
		System.out.println("Save succesffully");
		return true;
	}

}

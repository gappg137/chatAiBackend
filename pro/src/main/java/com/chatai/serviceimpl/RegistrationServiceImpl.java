package com.chatai.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.chatai.dto.RegistrationDto;
import com.chatai.repository.RegistrationRepository;
import com.chatai.service.Registrationservice;

public class RegistrationServiceImpl implements Registrationservice{

	@Autowired
	RegistrationRepository registrationRepository;
	
	@Override
	public RegistrationDto save(RegistrationDto registrationDto) {
		// TODO Auto-generated method stub
		return registrationRepository.save(registrationDto);
	}

}

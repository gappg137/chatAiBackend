package com.chatai.pro.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chatai.pro.dto.RegistrationDto;
import com.chatai.pro.repository.RegistrationRepository;
import com.chatai.pro.service.Registrationservice;
@Service
public class RegistrationServiceImpl implements Registrationservice{

	@Autowired
	RegistrationRepository registrationRepository;
	
	@Override
	public RegistrationDto save(RegistrationDto registrationDto) {
		// TODO Auto-generated method stub
		return registrationRepository.save(registrationDto);
	}

}

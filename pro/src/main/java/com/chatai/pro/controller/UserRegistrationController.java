package com.chatai.pro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chatai.pro.dto.RegistrationDto;
import com.chatai.pro.repository.RegistrationRepository;
import com.chatai.pro.service.Registrationservice;


//@CrossOrigin("*")
@RestController
@RequestMapping("x")
public class UserRegistrationController {
	@Autowired
	private RegistrationRepository registrationRepository;
	@Autowired
	private Registrationservice registrationservice;
	
	@PostMapping("/register")
	public RegistrationDto registerUser(@RequestBody RegistrationDto userRegis)
	{
		if(registrationRepository.findByusername(userRegis.getUsername())!=null) {
			throw new RuntimeException("Username already exists");
		}
		
		return registrationservice.save(userRegis);
	}
}

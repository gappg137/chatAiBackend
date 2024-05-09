package com.chatai.pro.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.chatai.pro.dto.RegistrationDto;
import com.chatai.pro.entity.UserRegistration;

public interface RegistrationRepository extends MongoRepository<RegistrationDto,String>{
	UserRegistration findByusername(String username);
}

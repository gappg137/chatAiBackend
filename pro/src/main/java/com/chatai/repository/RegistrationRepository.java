package com.chatai.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.chatai.dto.RegistrationDto;
import com.chatai.entity.UserRegistration;

public interface RegistrationRepository extends MongoRepository<RegistrationDto, Long>{
	UserRegistration findByusername(String username);
}

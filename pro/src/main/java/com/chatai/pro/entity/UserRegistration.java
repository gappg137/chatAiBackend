package com.chatai.pro.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.annotation.Generated;
import lombok.Data;

@Data
@Document(collection = "user")
public class UserRegistration {
	
	@Id
	private String id;
	private String username;
	private String password;
	
}

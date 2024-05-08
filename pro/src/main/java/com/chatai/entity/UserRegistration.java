package com.chatai.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "user")
public class UserRegistration {
	
	@Id
	private Long id;
	private String username;
	private String password;
	
}

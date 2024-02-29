package com.test.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.test.entity.UserEntity;
import com.test.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	
	public UserEntity saveUser(UserEntity userEntity) {
//		int randomUserId = UUID.randomUUID().toString();
//		userEntity.setUserId(randomUserId);
		return userRepository.save(userEntity);
	}
	public List<UserEntity> getAllUser() {
		return userRepository.findAll();
	}
	

}

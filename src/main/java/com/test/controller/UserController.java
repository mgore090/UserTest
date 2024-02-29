package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.UserEntity;
import com.test.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	UserService userService;
	
	@PostMapping
	public ResponseEntity<UserEntity> createUser(@RequestBody UserEntity userEntity){
		UserEntity user1 = userService.saveUser(userEntity);
		return ResponseEntity.status(HttpStatus.CREATED).body(user1);
	}
	@GetMapping("/getAllUsers")
	public ResponseEntity<List<UserEntity>> getAllUser(){
		List<UserEntity> users = userService.getAllUser();
		return ResponseEntity.ok(users);
	}
}

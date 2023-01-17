package com.example.flutterback.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.flutterback.backend.model.User;
import com.example.flutterback.backend.service.IUserService;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/api/user")
public class UserController {
    @Autowired
	IUserService userService;
	
	@PostMapping("/insert")
	public User insertUser(@RequestBody User user){
		return userService.insertUser(user);
	}
	
	@GetMapping("/getAll")
	public List<User> getAllUser(){
		return userService.getAllUser();
	}
}

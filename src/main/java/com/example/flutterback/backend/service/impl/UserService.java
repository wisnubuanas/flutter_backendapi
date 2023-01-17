package com.example.flutterback.backend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.flutterback.backend.model.User;
import com.example.flutterback.backend.repository.IUserRepository;
import com.example.flutterback.backend.service.IUserService;

@Service
public class UserService implements IUserService {
@Autowired
IUserRepository userRepository;
    @Override
    public User insertUser(User user) {
        // TODO Auto-generated method stub
		return userRepository.insertUser(user);
    }

    @Override
    public List<User> getAllUser() {
        // TODO Auto-generated method stub
		return userRepository.getAllUser();
    }
    
}

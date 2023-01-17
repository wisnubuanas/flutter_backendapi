package com.example.flutterback.backend.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.flutterback.backend.model.User;
import com.example.flutterback.backend.repository.IUserRepository;

@Repository
public class UserRepository implements IUserRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public User insertUser(User user) {
        // TODO Auto-generated method stub
        String query = "INSERT INTO tb_user(nama, email, gender) "
        + "VALUES(?, ?, ?)";
        jdbcTemplate.update(query, new Object[] {user.getNama(), user.getEmail(), user.getGender()});
        return user;
    }

    @Override
    public List<User> getAllUser() {
        // TODO Auto-generated method stub
		String query = "SELECT * FROM tb_user";
		return jdbcTemplate.query(query, new BeanPropertyRowMapper<>(User.class));
    }
    
}

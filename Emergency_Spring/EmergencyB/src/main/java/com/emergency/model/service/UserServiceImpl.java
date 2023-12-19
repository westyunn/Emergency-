package com.emergency.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emergency.model.dto.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserService userService;
	
	@Override
	public int createUser(User user) {
		return userService.createUser(user);
	}

	@Override
	public int updateUser(User user) {
		return userService.updateUser(user);
	}

	@Override
	public User selectUser(String id) {
		return userService.selectUser(id);
	}

	@Override
	public int deleteUser(String id) {
		return userService.deleteUser(id);
	}
	
}

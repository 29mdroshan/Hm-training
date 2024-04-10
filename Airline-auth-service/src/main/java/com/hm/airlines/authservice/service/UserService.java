package com.hm.airlines.authservice.service;

import com.hm.airlines.authservice.model.User;

public interface UserService {
	public User getUserByName(String username);
	
	public User saveUser(User user);

}

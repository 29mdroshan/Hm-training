package com.hm.airlines.authservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hm.airlines.authservice.model.User;
import com.hm.airlines.authservice.repository.AuthRepository;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	AuthRepository repo;
	
	
	@Override
	public User getUserByName(String username) {
		// TODO Auto-generated method stub
		return repo.findByUsername(username);
	}


	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return repo.save(user);
	}
	
	

}

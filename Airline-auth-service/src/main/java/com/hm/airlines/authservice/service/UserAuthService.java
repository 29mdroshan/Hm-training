package com.hm.airlines.authservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hm.airlines.authservice.dto.JwtToken;
import com.hm.airlines.authservice.dto.UserCredential;
import com.hm.airlines.authservice.exception.InvalidCredentailsException;
import com.hm.airlines.authservice.model.User;
import com.hm.airlines.authservice.repository.AuthRepository;
import com.hm.airlines.authservice.util.JwtUtil;


@Service
public class UserAuthService {

	@Autowired
	AuthRepository repo;
	
	@Autowired
	private JwtUtil jwtUtil;


	public JwtToken ValidateCredentails(UserCredential credentail) {
		
		User user= repo.findByUsername(credentail.getUsername());
		if(!user.getPassword().equals(credentail.getPassword())){
			throw new InvalidCredentailsException("Incorrect Password");
		}
		
		JwtToken jwt = jwtUtil.generateJwt(user.getUsername());
		
		return jwt;

		
	}

}

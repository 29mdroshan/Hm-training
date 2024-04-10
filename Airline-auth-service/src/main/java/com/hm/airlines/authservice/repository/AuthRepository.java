package com.hm.airlines.authservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hm.airlines.authservice.model.User;


public interface AuthRepository extends JpaRepository<User,Integer> {
	public User findByUsername(String username);
	

}

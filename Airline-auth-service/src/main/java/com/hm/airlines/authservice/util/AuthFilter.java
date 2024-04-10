package com.hm.airlines.authservice.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.http.auth.InvalidCredentialsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hm.airlines.authservice.exception.InvalidCredentailsException;
import com.hm.airlines.authservice.model.User;
import com.hm.airlines.authservice.model.UserType;
import com.hm.airlines.authservice.service.UserService;

@Component
public class AuthFilter implements Filter{
	
	@Autowired
	private JwtUtil util;
	
	@Autowired
	private UserService service;


	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		System.out.println("Filter Intercepted the Request");
		HttpServletRequest httpRequest=(HttpServletRequest) request;
		
		if(httpRequest.getRequestURI().startsWith("/public")) {
			chain.doFilter(httpRequest, response);
			return;
		}
		
		String header = httpRequest.getHeader("auth");
		if(header==null || header.isEmpty()) {
			throw new InvalidCredentailsException("Invalid Token/Credentials");
		}
		
		
		
		String username = util.decodeJwt(header);
		
		User user = service.getUserByName(username);
		if(user==null) {
			throw new InvalidCredentailsException("Invalid Token/Credentials");
	}
		UserType type=UserType.USER;
		if(user.getType()==type) {
			if(httpRequest.getRequestURI().startsWith("/user") ){
				chain.doFilter(request, response);
			}
			else {
				throw new InvalidCredentailsException("Invalid Token/Credentials");
			}
			
		}
		

		
			
		
		
		
	}
	}
	
		
	



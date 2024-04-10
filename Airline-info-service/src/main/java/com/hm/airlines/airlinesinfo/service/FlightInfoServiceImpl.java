package com.hm.airlines.airlinesinfo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hm.airlines.airlinesinfo.model.Flight;
import com.hm.airlines.airlinesinfo.repository.FlightInfoRepository;

@Service
public class FlightInfoServiceImpl implements FlightInfoService{
	
	@Autowired
	FlightInfoRepository repo;

	@Override
	public Flight getFlightInfo(String flightNo) {
		// TODO Auto-generated method stub
		return repo.getFlightInfo(flightNo);
	}

}

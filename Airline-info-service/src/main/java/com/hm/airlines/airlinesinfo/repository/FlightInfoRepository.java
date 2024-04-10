package com.hm.airlines.airlinesinfo.repository;

import org.springframework.stereotype.Repository;

import com.hm.airlines.airlinesinfo.model.Flight;


public interface FlightInfoRepository {
	
	
	public Flight getFlightInfo(String flightNo) ;

}

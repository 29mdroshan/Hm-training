package com.hm.airlines.airlinesinfo.repository;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.hm.airlines.airlinesinfo.model.Flight;
@Repository
public class FlightInfoRepositoryImpl implements FlightInfoRepository {
	
	Map<String ,Flight> flightDb;
	
	@PostConstruct
	public void init() {
		flightDb =new HashMap<>();
		
		Flight f1=new Flight("Indi123","Indigo",5000,"Bangalore","Mysore");
		Flight f2=new Flight("Akasa123","Akasa",10000,"Bangalore","Mumbai");
		Flight f3=new Flight("Jet123","Spice Jet",12000,"Bangalore","Pune");
		
		flightDb.put( f1.getFlightNo(),f1);
		flightDb.put( f2.getFlightNo(),f2);
		flightDb.put( f3.getFlightNo(),f3);
		
		
	}

	@Override
	public Flight getFlightInfo(String flightNo) {
		// TODO Auto-generated method stub
		return flightDb.get(flightNo);
	}

}

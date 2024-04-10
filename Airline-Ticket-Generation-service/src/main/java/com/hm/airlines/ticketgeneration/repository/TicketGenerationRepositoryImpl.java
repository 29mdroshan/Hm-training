package com.hm.airlines.ticketgeneration.repository;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.hm.airlines.ticketgeneration.model.Flight;
import com.hm.airlines.ticketgeneration.model.TicketGeneration;

@Repository
public class TicketGenerationRepositoryImpl implements TicketGenerationRepository {

	Map<Integer, TicketGeneration> ticketDb;

	@PostConstruct
	public void init() {
		ticketDb = new HashMap<>();

		Flight f1 = new Flight("Indi123", "Indigo", 5000, "Bangalore", "Mysore");
		Flight f2 = new Flight("Akasa123", "Akasa", 10000, "Bangalore", "Mumbai");
		Flight f3 = new Flight("Jet123", "Spice Jet", 12000, "Bangalore", "Pune");
		
		TicketGeneration t1=new TicketGeneration(8899,f1,"23A");
		TicketGeneration t2=new TicketGeneration(3344,f2,"20A");
		TicketGeneration t3=new TicketGeneration(5566,f3,"15B");
		
		ticketDb.put(t1.getTicketNo(), t1);
		ticketDb.put(t2.getTicketNo(), t2);
		ticketDb.put(t3.getTicketNo(), t3);
		

		
	}

	@Override
	public TicketGeneration getTicketInfo(int ticketNo) {

		return  ticketDb.get(ticketNo);
	}

}

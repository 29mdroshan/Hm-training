package com.hm.airlines.ticketgeneration.repository;

import com.hm.airlines.ticketgeneration.model.Flight;
import com.hm.airlines.ticketgeneration.model.TicketGeneration;

public interface TicketGenerationRepository {
	public TicketGeneration getTicketInfo(int ticketNo) ;

}

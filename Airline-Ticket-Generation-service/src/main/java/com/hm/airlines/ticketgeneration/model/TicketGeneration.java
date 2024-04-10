package com.hm.airlines.ticketgeneration.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class TicketGeneration {
	private int ticketNo;
	private Flight flightDetails;
	private String seatNo;
}

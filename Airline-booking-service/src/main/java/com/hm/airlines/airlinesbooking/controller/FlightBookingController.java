package com.hm.airlines.airlinesbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hm.airlines.airlinesbooking.model.BookingDetails;
import com.hm.airlines.airlinesbooking.model.Flight;
import com.hm.airlines.airlinesbooking.service.FlightBookingService;

@RestController
@RequestMapping("/bookings")
public class FlightBookingController {
	@Autowired
	FlightBookingService service;
	@GetMapping("/flight/{flightNo}/coupon/{code}")
	public BookingDetails getBookingDetails(@PathVariable String flightNo,@PathVariable String code) {
		System.out.println(flightNo);
		return service.getBookingDetails(flightNo, code);
	}
	@GetMapping("/flight/{flightNo}")
	public BookingDetails getBookingDetails(@PathVariable String flightNo) {
		return null;
		
	}
	
//	@GetMapping("/flight/{flightNo}")
//	public BookingDetails postBookingDetails()
	
//	@PostMapping
//	public Flight postToTicketGeneration() {
//		return service.s
//	}

	
	
}

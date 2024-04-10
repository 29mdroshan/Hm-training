package com.hm.airlines.airlinesbooking.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hm.airlines.airlinesbooking.model.BookingDetails;
import com.hm.airlines.airlinesbooking.model.Coupon;
import com.hm.airlines.airlinesbooking.model.Flight;

@Service
public class FlightBookingServiceImpl implements FlightBookingService{
	
	@Autowired
	private RestTemplate rt;
	

	

	@Override
	public BookingDetails getBookingDetails(String flightNo, String coupenCode) {
		// TODO Auto-generated method stub
		Flight flight=getFlightDetails(flightNo);
		Coupon coupon=getCouponDetails(coupenCode);
		double fare=flight.getFare();
		double discount=coupon.getDiscount();
		double finalfare=0;
		if(coupon.getValidTill().isAfter(LocalDate.now())) {
			
			 finalfare=fare-((fare*discount)/100);
		}
		else {
			 finalfare=flight.getFare();
			 
		}
		return new BookingDetails(flight,coupon,finalfare);
	}
	
	private Flight getFlightDetails(String flightNo) {
		Flight flightDetails=rt.getForObject("http://airlines-info-service/flight/"+flightNo, Flight.class);
		return flightDetails;
	}
	private Coupon getCouponDetails(String couponCode) {
		Coupon couponDetails=rt.getForObject("http://airlines-coupon-discounts-service/coupon/"+couponCode, Coupon.class);
		return couponDetails;
	}
	
//	private Flight sendFlightToTicket(Flight flight) {
//		return flight;
//	}

}

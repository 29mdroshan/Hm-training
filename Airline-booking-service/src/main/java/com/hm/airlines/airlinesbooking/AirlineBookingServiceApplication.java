package com.hm.airlines.airlinesbooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AirlineBookingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirlineBookingServiceApplication.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate getREstTemplateBean() {
		return new RestTemplate();
	}

}

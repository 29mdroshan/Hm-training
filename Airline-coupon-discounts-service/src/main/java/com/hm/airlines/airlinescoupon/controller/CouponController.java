package com.hm.airlines.airlinescoupon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hm.airlines.airlinescoupon.model.Coupon;
import com.hm.airlines.airlinescoupon.service.CouponDiscountService;



@RestController
@RequestMapping("/coupon")
public class CouponController {
	
	@Autowired
	private CouponDiscountService service;
	
	@GetMapping("/{couponNo}")
	public Coupon getCoupon(@PathVariable("couponNo") String couponNo) {
		return service.getCouponDiscount(couponNo);
	}

}

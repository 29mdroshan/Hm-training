package com.hm.airlines.airlinescoupon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hm.airlines.airlinescoupon.model.Coupon;
import com.hm.airlines.airlinescoupon.repository.CouponDiscountRepository;

@Service
public class CouponDiscountServiceImpl implements CouponDiscountService{
	
	@Autowired
	CouponDiscountRepository repo;

	@Override
	public Coupon getCouponDiscount(String couponCode) {
		// TODO Auto-generated method stub
		return repo.getCouponDiscount(couponCode);
	}

}

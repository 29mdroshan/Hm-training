package com.hm.airlines.airlinescoupon.repository;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.hm.airlines.airlinescoupon.model.Coupon;



@Repository
public class CouponDiscountRepositoryImpl implements CouponDiscountRepository {

	Map<String,Coupon > couponDb;

	@PostConstruct
	public void init() {
		couponDb = new HashMap<>();

		Coupon c1=new Coupon("100",20,LocalDate.of(2022, 12, 30));
		Coupon c2=new Coupon("200",40,LocalDate.of(2023, 01, 30));
		Coupon c3=new Coupon("300",60,LocalDate.of(2022, 11, 20));

		couponDb.put(c1.getCouponCode(), c1);
		couponDb.put(c2.getCouponCode(), c2);
		couponDb.put(c3.getCouponCode(), c3);

	}



	@Override
	public Coupon getCouponDiscount(String couponCode) {
		// TODO Auto-generated method stub
		return couponDb.get(couponCode);

	}

}

package com.hm.airlines.airlinescoupon.repository;

import com.hm.airlines.airlinescoupon.model.Coupon;

public interface CouponDiscountRepository {
	public Coupon getCouponDiscount(String couponCode);

}

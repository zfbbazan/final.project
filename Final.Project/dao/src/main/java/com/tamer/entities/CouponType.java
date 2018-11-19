package com.tamer.entities;

public enum CouponType {
	RESTURANTS("rest"),
	ELECTRICITY("elec"),
	FOOD("food"),
	HEALTH("health"),
	SPORTS("sports"),
	CAMPING("camp"),
	TRAVELLING("travel");
	
	private final String code;

	private CouponType(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

}

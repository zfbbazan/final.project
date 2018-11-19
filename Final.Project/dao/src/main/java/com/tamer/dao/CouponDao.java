package com.tamer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tamer.entities.Coupon;

public interface CouponDao extends JpaRepository<Coupon, Long> {

}

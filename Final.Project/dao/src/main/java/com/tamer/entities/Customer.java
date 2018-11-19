package com.tamer.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity(name = "CUSTOMERS")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String custName;
	private String password;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "CUSTOMER_COUPON",
			joinColumns = @JoinColumn(name = "CUSTOMER_ID"),
			inverseJoinColumns = @JoinColumn(name = "COUPON_ID")
	)
	
	private Collection<Coupon> coupon;
	
	public Customer() {
		super();
	}

	public Customer(long id, String custName, String password, Collection<Coupon> coupon) {
		super();
		this.id = id;
		this.custName = custName;
		this.password = password;
		this.coupon = coupon;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Collection<Coupon> getCoupon() {
		return coupon;
	}

	public void setCoupon(Collection<Coupon> coupon) {
		this.coupon = coupon;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", custName=" + custName + ", password=" + password + ", coupon=" + coupon + "]";
	}
	
}

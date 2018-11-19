package com.tamer.dao;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tamer.entities.Customer;

public interface CustomerDao extends JpaRepository<Customer, Long>{
	
	public Set getAllCustomers();
	
	public Set findCustomer(Customer id);
	
	public void addCustomer(Customer id);
	
	public void removeCustomer(Customer id);
}

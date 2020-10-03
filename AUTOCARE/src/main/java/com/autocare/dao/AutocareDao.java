package com.autocare.dao;

import java.util.List;

import com.autocare.entity.Customer;
import com.autocare.entity.Staff;

public interface AutocareDao {
	public void registerStaff(Staff staff);
	public List<Staff> getAllUsers();
	public void registerCustomer(Customer customer);
}

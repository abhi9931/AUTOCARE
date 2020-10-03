package com.autocare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.autocare.dao.AutocareDao;
import com.autocare.entity.Customer;
import com.autocare.entity.Staff;

@Service
public class AutocareServiceImpl implements AutocareService {
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	AutocareDao cdao;

	@Override
	public void registerStaff(Staff staff) {
		System.out.println("CarServiceImpl -> registerUser()");
		//System.out.println(customer.getPassword());
		staff.setPassword(bCryptPasswordEncoder.encode(staff.getPassword()));
		//System.out.println(customer.getPassword());
		staff.setRole("ROLE_Staff");
		staff.setStatus(1);
		
		cdao.registerStaff(staff);
		
	}

	@Override
	public List<Staff> getAllUsers() {
		System.out.println("CarServiceImpl -> getAllUsers()");
		return cdao.getAllUsers();
	}

	@Override
	public void registerCustomer(Customer customer) {
		System.out.println("CarServiceImpl -> registerCustomer()");	
		System.out.println(customer.getPassword());
		customer.setPassword(bCryptPasswordEncoder.encode(customer.getPassword()));
		System.out.println(customer.getPassword());
		customer.setRole("ROLE_Customer");
		customer.setStatus(1);
		cdao.registerCustomer(customer);
	}

}

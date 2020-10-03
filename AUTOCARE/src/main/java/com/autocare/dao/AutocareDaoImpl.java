package com.autocare.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.autocare.config.UsersRowMapper;
import com.autocare.entity.Customer;
import com.autocare.entity.Staff;

@Repository
public class AutocareDaoImpl implements AutocareDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	HibernateTemplate htemp;

	@Override
	public void registerStaff(Staff staff) {
		System.out.println("AutocareDaoImpl -> registerStaff()");
		htemp.save(staff);
		String sql2 = "insert into myroles(username, role) values(?,?)";
		jdbcTemplate.update(sql2, staff.getUsername(), staff.getRole());
	}

	@Override
	public List<Staff> getAllUsers() {
		System.out.println("CarDaoImpl -> getAllUsers()");
//		String sql = "select username, fname, lname, email, phone, active from users";
//		List<Staff> usersList = (List<Staff>) jdbcTemplate.query(sql, new UsersRowMapper());
		List<Staff> usersList = htemp.loadAll(Staff.class);
		return usersList;
	}

	@Override
	public void registerCustomer(Customer customer) {
		System.out.println("CarDaoImpl -> registerCustomer()");
		htemp.save(customer);
		String sql2 = "insert into myroles(username, role) values(?,?)";
		jdbcTemplate.update(sql2, customer.getUsername(), customer.getRole());
	}
}

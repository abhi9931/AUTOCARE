package com.autocare.config;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.autocare.entity.Staff;

public class UsersRowMapper implements RowMapper<Staff> {

	@Override
	public Staff mapRow(ResultSet rs, int rowNum) throws SQLException {
		Staff staff = new Staff();
		staff.setId(rs.getInt(1));
		staff.setName(rs.getString(2));
		staff.setUsername(rs.getString(3));
		staff.setEmail(rs.getString(5));
		staff.setPhone(rs.getString(6));
		staff.setAddress(rs.getString(7));
		staff.setType(rs.getString(8));
		staff.setRole(rs.getString(9));
		staff.setStatus(rs.getInt(10));
		return staff;
	}

}

package car.config;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import car.entity.Register;

public class UsersRowMapper implements RowMapper<Register> {

	@Override
	public Register mapRow(ResultSet rs, int rowNum) throws SQLException {
		Register register = new Register();
		register.setUsername(rs.getString(1));
		register.setFname(rs.getString(2));
		register.setLname(rs.getString(3));
		register.setEmail(rs.getString(4));
		register.setPhone(rs.getString(5));
		register.setActive(rs.getInt(6));
		return register;
	}

}

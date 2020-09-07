package car.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import car.config.UsersRowMapper;
import car.dao.CarDao;
import car.entity.Register;

@Repository
public class CarDaoImpl implements CarDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void registerUser(Register customer) {
		String sql = "insert into Users values(?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql, customer.getUsername(), customer.getPassword(), customer.getFname(), customer.getLname(),
				customer.getEmail(), customer.getPhone(), customer.getActive());
		String sql2 = "insert into myroles values(?,?)";
		jdbcTemplate.update(sql2, customer.getUsername(), "ROLE_Customer");
		
	}

	@Override
	public List<Register> getAllUsers() {
		System.out.println("CarDaoImpl -> getAllUsers()");
		String sql = "select username, fname, lname, email, phone, active from users";
		List<Register> usersList = (List<Register>) jdbcTemplate.query(sql, new UsersRowMapper());
		return usersList;
	}
}

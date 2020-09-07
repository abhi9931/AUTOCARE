package car.dao;

import java.util.List;

import car.entity.Register;

public interface CarDao {
	public void registerUser(Register customer);
	public List<Register> getAllUsers();
}

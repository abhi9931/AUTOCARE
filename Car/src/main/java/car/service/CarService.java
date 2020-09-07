package car.service;

import java.util.List;

import car.entity.Register;

public interface CarService {

	public void registerUser(Register customer);
	public List<Register> getAllUsers();
}

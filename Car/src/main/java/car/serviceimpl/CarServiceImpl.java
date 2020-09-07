package car.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import car.dao.CarDao;
import car.entity.Register;
import car.service.CarService;

@Service
public class CarServiceImpl implements CarService {
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	CarDao cdao;

	@Override
	public void registerUser(Register customer) {
		System.out.println("CarServiceImpl -> registerUser()");
		//System.out.println(customer.getPassword());
		customer.setPassword(bCryptPasswordEncoder.encode(customer.getPassword()));
		//System.out.println(customer.getPassword());
		customer.setActive(1);
		
		cdao.registerUser(customer);
		
	}

	@Override
	public List<Register> getAllUsers() {
		System.out.println("CarServiceImpl -> getAllUsers()");
		return cdao.getAllUsers();
	}

}

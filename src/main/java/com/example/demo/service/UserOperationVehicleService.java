package com.example.demo.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Operation;
import com.example.demo.entity.User;
import com.example.demo.entity.UserOperationVehicle;
import com.example.demo.entity.Vehicle;
import com.example.demo.repository.OperationRepository;
import com.example.demo.repository.UserOperationVehicleRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.VehicleRepository;

@Service
@Transactional
public class UserOperationVehicleService {

	@Autowired
	private UserOperationVehicleRepository uovRepo;

	@Autowired
	private UserRepository userRepo;

	@Autowired
	private VehicleRepository vehicleRepo;

	@Autowired
	private OperationRepository operationRepo;

	public void saveUserOperationVehicle(Operation o, long vehicleId) {
//		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//		User u = userRepo.findByName(((UserDetails) principal).getUsername()).get();

		// MOCK

		User u = userRepo.findById(9L).get();

		Vehicle v = vehicleRepo.findById(vehicleId).get();

		UserOperationVehicle uov = new UserOperationVehicle(u, o, v);

		o.addUserOperationVehicle(uov);
		operationRepo.save(o);

		u.addUserOperationVehicle(uov);
		userRepo.save(u);

		v.addUserOperationVehicle(uov);
		vehicleRepo.save(v);

		uovRepo.save(uov);
	}
}

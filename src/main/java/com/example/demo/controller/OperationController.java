package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Operation;
import com.example.demo.repository.OperationRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserOperationVehicleService;

//@PreAuthorize("hasAnyRole('ADMIN')")
@RestController
@RequestMapping("/operation")
public class OperationController {

	@Autowired
	OperationRepository operationRepository;

	@Autowired
	UserOperationVehicleService uovService;

	@Autowired
	UserRepository userRepository;

	@GetMapping("/all")
	public List<Operation> getAllOperations() {
		return operationRepository.findAll();
	}

	@PostMapping
	public void saveOperation(@RequestBody Operation o, @RequestParam long vehicleId) {
		Operation o1 = operationRepository.save(o);
		uovService.saveUserOperationVehicle(o1, vehicleId);
	}

	@DeleteMapping("/{id}")
	public void deleteOperation(@PathVariable long id) {
		operationRepository.deleteById(id);
	}

}

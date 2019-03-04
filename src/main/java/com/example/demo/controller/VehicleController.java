package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Vehicle;
import com.example.demo.repository.VehicleRepository;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

	@Autowired
	private VehicleRepository vehicleRepository;

	@GetMapping("/all")
	public List<Vehicle> getAllVehicles() {
		return vehicleRepository.findAll();
	}

	@GetMapping("/{id}")
	public Optional<Vehicle> getVehicleById(@PathVariable long id) {
		return vehicleRepository.findById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteVehicle(@PathVariable long id) {
		vehicleRepository.deleteById(id);
	}

	@PostMapping
	public Vehicle saveVehicle(@RequestBody Vehicle v) {
		return vehicleRepository.save(v);
	}

}

package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Operation;
import com.example.demo.repository.OperationRepository;

@RestController
@RequestMapping("/operation")
public class OperationController {

	@Autowired
	OperationRepository operationRepository;

	@RequestMapping("/all")
	public List<Operation> getAllOperations() {
		return operationRepository.findAll();
	}

	@PostMapping
	public Operation saveOperation(@RequestBody Operation o) {
		return operationRepository.save(o);
	}

	@DeleteMapping("/{id}")
	public void deleteOperation(@PathVariable long id) {
		operationRepository.deleteById(id);
	}

}

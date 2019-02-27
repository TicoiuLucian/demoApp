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

import com.example.demo.entity.Role;
import com.example.demo.repository.RoleRepository;

@RestController
@RequestMapping("/role")
public class RoleController {

	@Autowired
	private RoleRepository roleRepository;

	@RequestMapping("/all")
	public List<Role> getAllRoles() {
		return roleRepository.findAll();
	}

	@GetMapping("/{id}")
	public Optional<Role> getRoleById(@PathVariable long id) {
		return roleRepository.findById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteRole(@PathVariable long id) {
		roleRepository.deleteById(id);
	}

	@PostMapping
	public Role saveRole(@RequestBody Role r) {
		return roleRepository.save(r);
	}

}

package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

//@PreAuthorize("hasAnyRole('ADMIN')")
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@RequestMapping("/all")
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@GetMapping("/{id}")
	public Optional<User> getUserById(@PathVariable long id) {
		return userRepository.findById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable long id) {
		userRepository.deleteById(id);
	}

	@PostMapping
	public User saveUser(@RequestBody User u) {
		u.setPassword(passwordEncoder.encode(u.getPassword()));
		return userRepository.save(u);
	}

	@PutMapping("/update")
	public User updateUser(@RequestBody User u) {
		u.setPassword(passwordEncoder.encode(u.getPassword()));
		return userRepository.save(u);
	}
}

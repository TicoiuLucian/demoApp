package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class UserOperationVehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;

	@ManyToOne
	@JsonIgnore
	private User user;

	@ManyToOne
	@JsonIgnore
	private Operation operation;

	@ManyToOne
	@JsonIgnore
	private Vehicle vehicle;

	public UserOperationVehicle() {
		super();
	}

	public UserOperationVehicle(User user, Operation operation, Vehicle vehicle) {
		super();
		this.user = user;
		this.operation = operation;
		this.vehicle = vehicle;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Operation getOperation() {
		return operation;
	}

	public void setOperation(Operation operation) {
		this.operation = operation;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public long getId() {
		return id;
	}
}

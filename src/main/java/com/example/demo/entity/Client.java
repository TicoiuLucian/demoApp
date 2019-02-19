package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;


@Entity
public class Client extends Person{
	
	@OneToOne
	private Address address;

	@OneToOne(mappedBy = "client")
	private Vehicle vehicle;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
}

package com.example.demo.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Operation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String name;
	
	@Temporal(TemporalType.DATE)
	private Date inDate;
	
	@Temporal(TemporalType.DATE)
	private Date outDate;
	
	@OneToMany(mappedBy = "operation")
	private List<Part> parts;
	
	private int laborPrice;
	
	@ManyToOne
	private Vehicle vehicle;

	public Date getInDate() {
		return inDate;
	}

	public void setInDate(Date inDate) {
		this.inDate = inDate;
	}

	public Date getOutDate() {
		return outDate;
	}

	public void setOutDate(Date outDate) {
		this.outDate = outDate;
	}

	public List<Part> getParts() {
		return parts;
	}

	public void setParts(List<Part> parts) {
		this.parts = parts;
	}

	public int getLaborPrice() {
		return laborPrice;
	}

	public void setLaborPrice(int laborPrice) {
		this.laborPrice = laborPrice;
	}

	public long getId() {
		return id;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
}

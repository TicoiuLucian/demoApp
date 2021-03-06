package com.example.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Operation {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;

	private String name;

	@Temporal(TemporalType.DATE)
	private Date inDate;

	@Temporal(TemporalType.DATE)
	private Date outDate;

	@ManyToMany(mappedBy = "operations")
	@JsonIgnore
	private List<Part> parts;

	private int laborPrice;

	@OneToMany(mappedBy = "operation")
	private List<UserOperationVehicle> uov = new ArrayList<>();

//	@ManyToMany(cascade = CascadeType.MERGE)
//	@JoinTable(name = "operations_users", joinColumns = @JoinColumn(name = "operation_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"))
//	private List<User> users = new ArrayList<User>();

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<UserOperationVehicle> getUserOperationVehicle() {
		return uov;
	}

	public void addUserOperationVehicle(UserOperationVehicle uov) {
		this.uov.add(uov);
	}
}

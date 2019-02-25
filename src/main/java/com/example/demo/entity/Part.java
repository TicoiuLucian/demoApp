package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Part {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;

	private int price;

	private String name;

	private String manufacturer;

	private String code;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="operation_id",  nullable = true)
	private Operation operation;

	public Part() {}
	
	public Part(Part part) {
		this.price = part.getPrice();
		this.name = part.getName();
		this.manufacturer = part.getManufacturer();
		this.code = part.getCode();
		this.operation = part.getOperation();
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public long getId() {
		return id;
	}

	public Operation getOperation() {
		return operation;
	}

	public void setOperation(Operation operation) {
		this.operation = operation;
	}

}

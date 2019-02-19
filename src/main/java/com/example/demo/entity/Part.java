package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Part {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private int price;

	private String name;

	private String manufacturer;

	private String code;

	@ManyToOne
	private Operation operation;

	public Part(int price, String name, String manufacturer, String code) {
		super();
		this.price = price;
		this.name = name;
		this.manufacturer = manufacturer;
		this.code = code;
	}

	public Part() {
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

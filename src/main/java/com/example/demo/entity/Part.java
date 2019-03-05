package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Part {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;

	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	@JoinTable(name = "parts_prices", joinColumns = @JoinColumn(name = "part_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "price_id", referencedColumnName = "id"))
	private List<Price> prices = new ArrayList<Price>();

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String manufacturer;

	@Column(nullable = false)
	private String code;

	@ManyToMany
	@JoinTable(name = "parts_operations", joinColumns = @JoinColumn(name = "part_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "operation_id", referencedColumnName = "id"))
	private List<Operation> operations;

	public List<Price> getPrices() {
		return prices;
	}

	public void setPrices(List<Price> prices) {
		this.prices = prices;
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

	public List<Operation> getOperations() {
		return operations;
	}

	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}

}

package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Price {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;

	private int partValue;

	@ManyToMany(mappedBy = "prices")
	@JsonIgnore
	private List<Part> parts = new ArrayList<Part>();

	public int getPrice() {
		return partValue;
	}

	public long getId() {
		return id;
	}

	public void setPartValue(int partValue) {
		this.partValue = partValue;
	}

	public List<Part> getParts() {
		return parts;
	}

	public void setParts(List<Part> parts) {
		this.parts = parts;
	}

}

package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(nullable = false)
	private String model;

	@Column(nullable = false)
	private String manufacturer;

	@Column(nullable = false)
	private long km;

	@Column(nullable = false)
	private String vin;

	private String licenceNumber;

	@OneToOne
	private Client client;

	@OneToMany(mappedBy = "vehicle")
	private List<UserOperationVehicle> uov = new ArrayList<>();

	@Enumerated(EnumType.STRING)
	private VehicleType vehicleType;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public long getKm() {
		return km;
	}

	public void setKm(long km) {
		this.km = km;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public List<UserOperationVehicle> getUserOperationVehicle() {
		return uov;
	}

	public void addUserOperationVehicle(UserOperationVehicle uov) {
		this.uov.add(uov);
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public long getId() {
		return id;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getLicenceNumber() {
		return licenceNumber;
	}

	public void setLicenceNumber(String licenceNumber) {
		this.licenceNumber = licenceNumber;
	}

}

package com.example.demo.entity;

import javax.persistence.Entity;

@Entity
public class Mechanic extends Person {

	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}

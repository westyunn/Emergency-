package com.emergency.model.dto;

public class User {
	private String id;
	private String name;
	private String password;
	private int height;
	private int weight;
	private String bloodtype;
	private String guardianTel;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getBloodtype() {
		return bloodtype;
	}

	public void setBloodtype(String bloodtype) {
		this.bloodtype = bloodtype;
	}

	public String getGuardianTel() {
		return guardianTel;
	}

	public void setGuardianTel(String guardianTel) {
		this.guardianTel = guardianTel;
	}

}

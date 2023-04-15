package com.structural.adapter;

public class EmployeeClassAdapter extends Employee implements Customer{

	@Override
	public String getFname() {
		return this.getFirstName();
	}

	@Override
	public String getSurName() {
		return this.getLastName();
	}

	@Override
	public String getBloodGroupDetails() {
		return this.getBloodGroup();
	}


}

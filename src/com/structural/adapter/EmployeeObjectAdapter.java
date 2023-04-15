package com.structural.adapter;

public class EmployeeObjectAdapter implements Customer{

	private Employee employee;
	
	public EmployeeObjectAdapter(Employee employee) {
		this.employee = employee;
	}
	@Override
	public String getFname() {
		return employee.getFirstName();
	}

	@Override
	public String getSurName() {
		return employee.getLastName();
	}

	@Override
	public String getBloodGroupDetails() {
		return employee.getBloodGroup();
	}
}

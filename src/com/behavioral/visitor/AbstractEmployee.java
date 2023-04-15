package com.behavioral.visitor;

public abstract class AbstractEmployee  {
	private String name;
	private String empId;
	private String role;
	private String rating;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	abstract AbstractEmployee processRequest(EmployeeVisitor visitor);
	
}

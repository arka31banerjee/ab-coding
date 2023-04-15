package com.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Engineer implements Employee{
	private List<Employee> employeeList = new ArrayList<Employee>();
	@Override
	public void showListOfEngineers() {
		employeeList.forEach(Employee::showListOfEngineers);
	}
	
	public void addEmployee(Employee employee) {
		if(employee!=null)employeeList.add(employee);
		else throw new IllegalArgumentException("Null object can't be added");
	}
	
	public void removeEmployee(Employee employee) {
		employeeList.remove(employee);
	}

}

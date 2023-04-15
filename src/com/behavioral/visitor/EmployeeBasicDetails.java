package com.behavioral.visitor;

import java.util.concurrent.ThreadLocalRandom;

public class EmployeeBasicDetails implements EmployeeVisitor{

	@Override
	public AbstractEmployee operateRequest(AbstractEmployee employee) {
		switch(employee.getRole().toUpperCase()) {
		case "DEVELOPER":
			((Developer) employee).setResponsibility("Coding");
			break;
		case "LEAD":
			((TeamLead) employee).setTeamMembers(ThreadLocalRandom.current().nextInt(5, 15));
			break;
		case "MANAGER":
			((Manager) employee).setExperience(ThreadLocalRandom.current().nextInt(10, 25));
			break;
		default: return null;
		}
		return employee;
	}

}

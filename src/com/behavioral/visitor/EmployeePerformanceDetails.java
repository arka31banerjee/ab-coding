package com.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmployeePerformanceDetails implements EmployeeVisitor{

	@Override
	public AbstractEmployee operateRequest(AbstractEmployee employee) {
		List<String> bands = new ArrayList<String>();
		bands.add("A");
		bands.add("B");
		bands.add("C");
		bands.add("D");
		switch(employee.getRole().toUpperCase()) {
		case "DEVELOPER": 
			employee.setRating(bands.get(new Random().nextInt(4)));
			break;
		case "LEAD": 
			employee.setRating(bands.get(new Random().nextInt(3)));
			break;
		case "MANAGER":
			employee.setRating(bands.get(new Random().nextInt(2)));
			break;
		default: return null;
		}
		return employee;
}
}

package com.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class EmployeeRegistry {
	private static Map<String, ITEmployee> employeeRegistry = new HashMap<>();
	static {
		employeeRegistry.put("dev",new Developer());
		employeeRegistry.put("qa",new Tester());
		employeeRegistry.put("l2",new Support());
	}
	public static ITEmployee getEmployee(String type) {
		return (ITEmployee) employeeRegistry.get(type).clone();
	}
}

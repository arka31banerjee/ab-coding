package com.creational.prototype;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PrototypeTest {

	public static void main(String[] args) {
		List<String> empTypes = Arrays.asList("dev", "qa", "l2");
		Random rand = new Random();
		ITEmployee emp = EmployeeRegistry.getEmployee(empTypes.get(rand.nextInt(3)));
		emp.doWork();
	}

}

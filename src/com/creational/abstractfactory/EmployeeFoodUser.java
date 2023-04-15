package com.creational.abstractfactory;

public class EmployeeFoodUser implements FoodAppUser {

	@Override
	public void showDiscount() {
		System.out.println("Employee discount : 10%");
	}

}

package com.creational.abstractfactory;

public class StudentFoodUser implements FoodAppUser {

	@Override
	public void showDiscount() {
		System.out.println("Student discount : 15%");
	}

}

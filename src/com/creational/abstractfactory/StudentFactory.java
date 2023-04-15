package com.creational.abstractfactory;

public class StudentFactory extends AbstractFactory{

	@Override
	protected AppUser getAppUserType(String type) {
		switch(type) {
		case "school" : return new SchoolStudent();
		case "university" : return new UniversityStudent();
		default : return null;
		}
	}

	@Override
	protected FoodAppUser getFoodUserType() {
		return new StudentFoodUser();
	}

}

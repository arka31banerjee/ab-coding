package com.creational.abstractfactory;

public class EmployeeFactory extends AbstractFactory{

	@Override
	protected AppUser getAppUserType(String type) {
		switch(type) {
		case "it" : return new ITEmpolyee();
		case "bank" : return new BankEmployee();
		default : return null;
		}
	}

	@Override
	protected FoodAppUser getFoodUserType() {
		return new EmployeeFoodUser();
	}

}

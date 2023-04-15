package com.creational.abstractfactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String type) {
		switch(type) {
		case "employee" : return new EmployeeFactory();
		case "student" : return new StudentFactory();
		default : return null;
		}
	}
}

package com.creational.factorymethod;

public class StudentCreator extends UserCreator {

	@Override
	public User createUser() {
		return new StudentUser();
	}

}

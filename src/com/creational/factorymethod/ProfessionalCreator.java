package com.creational.factorymethod;

public class ProfessionalCreator extends UserCreator {

	@Override
	public User createUser() {
		return new ProfessionalUser();
	}

}

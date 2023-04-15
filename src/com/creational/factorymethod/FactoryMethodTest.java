package com.creational.factorymethod;

public class FactoryMethodTest {

	public static void main(String[] args) {
		UserCreator student = new StudentCreator();
		printUserType(student);
		
		UserCreator proffesional = new ProfessionalCreator();
		printUserType(proffesional);

	}

	private static void printUserType(UserCreator createUser) {
		User user = createUser.getUser();
		System.out.println(user);
	}

}

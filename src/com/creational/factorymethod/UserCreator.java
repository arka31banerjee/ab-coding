package com.creational.factorymethod;

public abstract class UserCreator {

	public User getUser() {
		User user = createUser();
		if(user instanceof StudentUser)
			user.setDiscount(20);
		else
			user.setDiscount(10);
		return user;
	}
	
	public abstract User createUser();
}

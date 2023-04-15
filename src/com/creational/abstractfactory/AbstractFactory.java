package com.creational.abstractfactory;

public abstract class AbstractFactory {
	protected abstract AppUser getAppUserType(String userType);
	protected abstract FoodAppUser getFoodUserType();
}

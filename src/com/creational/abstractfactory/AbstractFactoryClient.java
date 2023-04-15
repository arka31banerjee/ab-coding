package com.creational.abstractfactory;

public class AbstractFactoryClient {

	public static void main(String[] args) {
		AppUser user1 = FactoryProducer.getFactory("employee").getAppUserType("bank");
		user1.showHomePage();
		AppUser user2 = FactoryProducer.getFactory("employee").getAppUserType("it");
		user2.showHomePage();
		AppUser user3 = FactoryProducer.getFactory("student").getAppUserType("school");
		user3.showHomePage();
		AppUser user4 = FactoryProducer.getFactory("student").getAppUserType("university");
		user4.showHomePage();
		FoodAppUser user5 = FactoryProducer.getFactory("employee").getFoodUserType();
		user5.showDiscount();
		FoodAppUser user6 = FactoryProducer.getFactory("student").getFoodUserType();
		user6.showDiscount();
	}

}

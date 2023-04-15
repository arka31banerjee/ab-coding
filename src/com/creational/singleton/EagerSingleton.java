package com.creational.singleton;

public class EagerSingleton {
	//Create private constructor so that objects can't be created outside
	private EagerSingleton() {
		System.out.println("Eager Initialization");
	}
	
	//Create instance during class loading :: Eager initialization
	private static final EagerSingleton INSTANCE = new EagerSingleton();
	
	//Always will return same instance
	public static EagerSingleton getInstance() {
		return INSTANCE;
	}
}

package com.creational.singleton;

public class LazySingleton {
	//Create private constructor so that objects can't be created outside
	private LazySingleton() {
		System.out.println("Lazy Initialization");
	}
	//JVM often refers to cached memory, in a multi threading scenario once instance is created by 1 thread
	//but value of instance is not updated in cache, then again we might end up with creating multiple instances [by other threads]
	//To restrict that we should use volatile keyword, so that value will be read from main memory.
	private static volatile LazySingleton INSTANCE;
	
	//Lazy initialization :: Use synchronized to avoid multiple threads scenario
	//Lock should be taken on entire class to ensure no other thread is accessing this block,
	//otherwise we might end up with creating multiple objects
	public static LazySingleton getInstance() {
		if(INSTANCE==null) {
			synchronized (LazySingleton.class) {
				INSTANCE = INSTANCE==null?new LazySingleton():INSTANCE;
	//Double checking is needed, as t1 & t2 both can invoke 1st if block simultaneously before acquiring the lock.
			}
		}
		return INSTANCE;
	}
}

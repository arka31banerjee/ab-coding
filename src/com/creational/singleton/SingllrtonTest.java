package com.creational.singleton;

public class SingllrtonTest {

	public static void main(String[] args) {
		
		EagerSingleton es1 = EagerSingleton.getInstance();
		EagerSingleton es2 = EagerSingleton.getInstance();
		//Reference comparison of singleton reference variables.
		System.out.println(es1==es2);
		
		LazySingleton ls1 = LazySingleton.getInstance();
		LazySingleton ls2 = LazySingleton.getInstance();
		System.out.println(ls1==ls2);
	}

}

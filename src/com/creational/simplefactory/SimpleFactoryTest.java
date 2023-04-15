package com.creational.simplefactory;

public class SimpleFactoryTest {

	public static void main(String[] args) {
		System.out.println(CreateProduct.getProduct("shoe"));
		System.out.println(CreateProduct.getProduct("hair gel"));

	}

}

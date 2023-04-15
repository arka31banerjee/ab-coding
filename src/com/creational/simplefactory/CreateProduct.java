package com.creational.simplefactory;

public class CreateProduct {
	public static Product getProduct(String product) {
		switch(product) {
		case "shoe" : return new Shoe();
		case "dress" : return new Dress();
		case "sunglass" : return new Sunglass();
		default : throw new IllegalArgumentException("Product unavailable");
		}
	}
}

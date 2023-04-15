package com.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private String id;
	private double itemCost;
	private int count;
	private double discount;
	private double shippingCost;
	private List<Observer> observers = new ArrayList<Observer>();
	public Order(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "id=" + id + "\nNumber of Items=" + getNoOfItems() +"\nAmount Payable=" + getTotal();
	}
	public double getTotal() {
		double total = itemCost - discount + shippingCost;
		return (int)Math.round(total);
	}
	public int getNoOfItems() {
		return count;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getShippingCost() {
		return shippingCost;
	}
	public void setShippingCost(double shippingCost) {
		this.shippingCost = shippingCost;
	}
	
	public void addItem(double price) {
		this.itemCost += price;
		this.count++;
		observers.forEach(o -> o.updateOrder(this));
	}
	
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
}

package com.behavioral.observer;

public class ObserverTest {

	public static void main(String[] args) {
		Order order = new Order("#Order1");
		Observer price = new PriceObserver();
		Observer qty = new QuantityObserver();
		order.registerObserver(price);
		order.registerObserver(qty);
		order.addItem(452);
		order.addItem(45);
		order.addItem(93);
		order.addItem(712);
		order.addItem(124);
		System.out.println(order);
		System.out.println(Runtime.getRuntime().availableProcessors());
	}

}

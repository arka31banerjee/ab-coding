package com.behavioral.observer;

public class PriceObserver implements Observer{

	@Override
	public void updateOrder(Order order) {
		double discount = order.getTotal()>500?(25*order.getTotal()/500):0;
		order.setDiscount(discount);
	}
}

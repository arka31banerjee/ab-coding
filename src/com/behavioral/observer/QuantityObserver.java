package com.behavioral.observer;

public class QuantityObserver implements Observer{

	@Override
	public void updateOrder(Order order) {
		double shippingCost = order.getNoOfItems()>=5?0:(100*order.getNoOfItems()/5);
		order.setShippingCost(shippingCost);
	}


}

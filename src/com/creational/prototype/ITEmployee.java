package com.creational.prototype;

public abstract class ITEmployee implements Cloneable {
	public abstract void doWork();
	@Override
	public Object clone() {
		Object clone = null;
		try
		{
			clone = super.clone();
		}
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		return clone;
	}
}

package com.structural.composite;

public class Tester implements Employee{
	private String name;
    private long empId;
    private String position;
    public Tester(long empId, String name, String position)
    {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }
	@Override
	public void showListOfEngineers() {
		System.out.println("TESTER : "+this);
	}
	@Override
	public String toString() {
		return "[name=" + name + ", empId=" + empId + ", position=" + position + "]";
	}
	

}

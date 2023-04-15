package com.structural.adapter;

public class AdapterTest {

	public static void main(String[] args) {
		EmployeeClassAdapter classAdapter = new EmployeeClassAdapter();
		getIcardDetails(classAdapter);//using classAdapter where parent class ref is required
		System.out.println("*********** 2 WAY CLASS ADAPTER *************");
		System.out.println(getIcard(classAdapter));//using classAdapter where Interface ref is required
		
		System.out.println("*********** OBJECT ADAPTER *************");
		EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(getIcardDetails(new Employee()));
		System.out.println(getIcard(objectAdapter));
	}
	
	public static String getIcard(Customer customer) {
		return customer.getFname()+" "+customer.getSurName()+"\nBlood Group : "+customer.getBloodGroupDetails();
	}
	
	public static Employee getIcardDetails(Employee customer) {
		customer.setFirstName("Arka");
		customer.setLastName("Banerjee");
		customer.setBloodGroup("O+");
		return customer;
	}

}

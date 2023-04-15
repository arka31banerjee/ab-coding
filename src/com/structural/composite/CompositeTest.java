package com.structural.composite;

public class CompositeTest {

	public static void main(String[] args) {
		Developer dev1 = new Developer(100, "Lokesh Sharma", "Pro Developer");
        Developer dev2 = new Developer(101, "Vinay Sharma", "Developer");
        Engineer devDirectory = new Engineer();
        devDirectory.addEmployee(dev1);
        devDirectory.addEmployee(dev2);
           
        Tester tester1 = new Tester(200, "Kushagra Garg", "Mannual Tester");
        Tester tester2 = new Tester(201, "Vikram Sharma ", "Automation Tester");
           
        Engineer qaDirectory = new Engineer();
        qaDirectory.addEmployee(tester1);
        qaDirectory.addEmployee(tester2);
       
        Engineer engineers = new Engineer();
        engineers.addEmployee(devDirectory);
        engineers.addEmployee(qaDirectory);
        engineers.showListOfEngineers();
	}

}

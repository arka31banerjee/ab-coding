package com.behavioral.visitor;

public class VisitorTest {

	public static void main(String[] args) {
		EmployeeBasicDetails detailsVisitor = new EmployeeBasicDetails();
		EmployeePerformanceDetails performanceVisitor = new EmployeePerformanceDetails();
		Developer developer = new Developer();
		setEmployeeProperties(developer,"Arka","101", "DEVELOPER",detailsVisitor,performanceVisitor);
		TeamLead lead = new TeamLead();
		setEmployeeProperties(lead,"Anirban","102", "lead",detailsVisitor,performanceVisitor);
		Manager mgr = new Manager();
		setEmployeeProperties(mgr,"Subhankar","103", "Manager",detailsVisitor,performanceVisitor);
		System.out.println(developer);
		System.out.println(lead);
		System.out.println(mgr);
	}

	private static void setEmployeeProperties(AbstractEmployee emp, String name, String id, String role, EmployeeBasicDetails detailsVisitor, EmployeePerformanceDetails performanceVisitor) {
		emp.setName(name);
		emp.setEmpId(id);
		emp.setRole(role);
		emp.processRequest(detailsVisitor);
		emp.processRequest(performanceVisitor);
	}

}

package com.behavioral.visitor;

public class Developer extends AbstractEmployee{
	private String responsibility;
	@Override
	AbstractEmployee processRequest(EmployeeVisitor visitor) {
		return visitor.operateRequest(this);
	}
	public String getResponsibility() {
		return responsibility;
	}
	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}
	@Override
	public String toString() {
		return "Developer [responsibility=" + responsibility + ", NAME=" + getName() + ", EMPID=" + getEmpId()
				+ ", ROLE=" + getRole() + ", RATING=" + getRating() + "]";
	}

}

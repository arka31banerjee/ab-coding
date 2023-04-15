package com.behavioral.visitor;

public class Manager extends AbstractEmployee{
	private int experience;
	@Override
	AbstractEmployee processRequest(EmployeeVisitor visitor) {
		return visitor.operateRequest(this);
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Manager [experience=" + experience + ", NAME=" + getName() + ", EMPID=" + getEmpId()
		+ ", ROLE=" + getRole() + ", RATING=" + getRating() + "]";
	}


}

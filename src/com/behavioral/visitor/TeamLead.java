package com.behavioral.visitor;

public class TeamLead extends AbstractEmployee{
	private int teamMembers;
	@Override
	AbstractEmployee processRequest(EmployeeVisitor visitor) {
		return visitor.operateRequest(this);
	}
	public int getTeamMembers() {
		return teamMembers;
	}
	public void setTeamMembers(int teamMembers) {
		this.teamMembers = teamMembers;
	}
	@Override
	public String toString() {
		return "TeamLead [teamMembers=" + teamMembers + ", NAME=" + getName() + ", EMPID=" + getEmpId()
		+ ", ROLE=" + getRole() + ", RATING=" + getRating() + "]";
	}
	
}

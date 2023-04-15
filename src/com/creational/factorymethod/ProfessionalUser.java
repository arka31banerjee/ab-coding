package com.creational.factorymethod;

public class ProfessionalUser extends User {
	private String highestQualification;
	private int experience;
	private String currentOrganization;
	public String getHighestQualification() {
		return highestQualification;
	}
	public void setHighestQualification(String highestQualification) {
		this.highestQualification = highestQualification;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getCurrentOrganization() {
		return currentOrganization;
	}
	public void setCurrentOrganization(String currentOrganization) {
		this.currentOrganization = currentOrganization;
	}
	@Override
	public String toString() {
		return "ProfessionalUser [highestQualification=" + highestQualification + ", experience=" + experience
				+ ", currentOrganization=" + currentOrganization + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getType()=" + getType() + ", getDiscount()=" + getDiscount() + "]";
	}
}

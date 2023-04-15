package com.creational.factorymethod;

public class StudentUser extends User {
 private String qualification;

public String getQualification() {
	return qualification;
}

public void setQualification(String qualification) {
	this.qualification = qualification;
}

@Override
public String toString() {
	return "StudentUser [qualification=" + qualification + ", getId()=" + getId() + ", getName()=" + getName()
			+ ", getType()=" + getType() + ", getDiscount()=" + getDiscount() + "]";
}
}

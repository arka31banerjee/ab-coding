package com.creational.builder;

public interface UserDTOBuilder {
	UserDTOBuilder buildWithName(String fname, String lname);
	UserDTOBuilder buildWithId(String id);
	UserDTOBuilder buildWithAddress(Address address);
	UserDTO build();
	UserDTO getUserDTO();
}

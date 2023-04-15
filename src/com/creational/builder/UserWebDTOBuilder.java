package com.creational.builder;

public class UserWebDTOBuilder implements UserDTOBuilder {
	
	private UserDTO dto;
	private String name;
	private String id;
	private String address;
	
	@Override
	public UserDTOBuilder buildWithName(String fname, String lname) {
		this.name = fname + " " + lname;
		return this;
	}

	@Override
	public UserDTOBuilder buildWithId(String id) {
		this.id = id;
		return this;
	}
	
	@Override
	public UserDTOBuilder buildWithAddress(Address address) {
		this.address = address.getFirstLine()+ "\n" + address.getSecondLine()+ "\nZIP :" + address.getZipCode();
		return this;
	}

	
	@Override
	public UserDTO build() {
		dto = new UserWebDTO(name,id,address);
		return dto;
	}

	@Override
	public UserDTO getUserDTO() {
		return dto;
	}
	
}

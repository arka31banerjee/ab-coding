package com.creational.builder;

public class UserWebDTO implements UserDTO {
	private String name;
	private String id;
	private String address;

	public UserWebDTO(String name, String id, String address) {
		this.name = name;
		this.id = id;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String getAddress() {
		return address;
	}
	
	@Override
	public String toString() {
		return "UserWebDTO --> \nName : " + name + ",\nId : " + id + ",\nAddress :\n" + address;
	}
}

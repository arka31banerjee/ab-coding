package com.creational.builder;

public class ConcreteUserDTO {
	private String name;
	private String id;
	private String address;
	
	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	private void setId(String id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	private void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "ConcreteUserDTO --> \nName : " + name + ",\nId : " + id + ",\nAddress : " + address;
	}
	
	public static ConcreteUserDTOBuilder getBuilder() {
		return new ConcreteUserDTOBuilder();
	}
	
	public static class ConcreteUserDTOBuilder{
		private ConcreteUserDTO dto;
		private String name;
		private String id;
		private String address;
		
		public ConcreteUserDTOBuilder buildWithName(String fname, String lname) {
			this.name = fname + " " + lname;
			return this;
		}

		public ConcreteUserDTOBuilder buildWithId(String id) {
			this.id = id;
			return this;
		}
		
		public ConcreteUserDTOBuilder buildWithAddress(Address address) {
			this.address = address.getFirstLine()+ "\n" + address.getSecondLine()+ "\nZIP :" + address.getZipCode();
			return this;
		}

		
		public ConcreteUserDTO build() {
			dto = new ConcreteUserDTO();
			dto.setAddress(address);
			dto.setId(id);
			dto.setName(name);
			return dto;
		}

		public ConcreteUserDTO getUserDTO() {
			return dto;
		}
	}
	
}

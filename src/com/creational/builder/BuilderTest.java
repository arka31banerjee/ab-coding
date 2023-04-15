package com.creational.builder;

import com.creational.builder.ConcreteUserDTO.ConcreteUserDTOBuilder;

public class BuilderTest {

	public static void main(String[] args) {
		User user = createUser();
		UserDTOBuilder builder = new UserWebDTOBuilder();
		UserDTO dto1 = directBuild(builder,user);
		System.out.println(dto1);
		ConcreteUserDTO dto2 = directBuildConcrete(ConcreteUserDTO.getBuilder(),user);
		System.out.println(dto2);
	}

	private static UserDTO directBuild(UserDTOBuilder builder,User user) {
		return builder.buildWithName(user.getFname(), user.getLname()).buildWithId(user.getId())
						.buildWithAddress(user.getAddress()).build();
	}
	private static ConcreteUserDTO directBuildConcrete(ConcreteUserDTOBuilder concreteUserDTOBuilder,User user) {
		return concreteUserDTOBuilder.buildWithName(user.getFname(), user.getLname()).buildWithId(user.getId())
				.buildWithAddress(user.getAddress()).build();
	}

	private static User createUser() {
		User user = new User();
		user.setId("154758");
		user.setFname("Arka");
		user.setLname("Banerjee");
		Address address = new Address();
		address.setFirstLine("Flat no : 306, Shradhanjali Apartment, N-79/6 Lal Bahadur Shastri Road");
		address.setSecondLine("Konnagar, Hooghly, West Bengal");
		address.setZipCode("712235");
		user.setAddress(address);
		return user;
	}

}

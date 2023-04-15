package com.creational.immutable;

import java.util.HashMap;
import java.util.Map;

public class ImmutableTest {

	public static void main(String[] args) {
		Map<String,Integer> marks = new HashMap();
		marks.put("Maths", 96);
		marks.put("Physics", 87);
		marks.put("Chemistry", 87);
		ImmutableStudent student = new ImmutableStudent(4,"Arka Banerjee",marks);
		System.out.println(student);
		student.getMarksMap().put("Physics", 97);
		System.out.println(student);
		student.getMarksMap().put("Computer SC", 79);
		System.out.println(student);
		student.getMarksMap().remove("Maths");
		System.out.println(student);

	}

}

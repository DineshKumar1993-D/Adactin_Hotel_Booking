package com.pojorunner;

import com.pojo.Pojo_Class;

public class Pojo_Runner {

	public static void main(String[] args) {

		Pojo_Class obj = new Pojo_Class();

		obj.setName("Karthik");
		obj.setAge(25);

		String name = obj.getName();

		int age = obj.getAge();

		System.out.println(name + " " + age);
	}
}

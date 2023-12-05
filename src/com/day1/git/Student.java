package com.day1.git;

public class Student {

	static String name;
	static String sem;
	static int age;

	public static void main(String[] args) {
		name = "Rohith";
		sem = "2nd";
		age = 24;
		System.out.println("Hi " + name + ". How can I help you?");

		Student student = new Student();
		System.out.println(student.enrollToSports());

	}

	public String enrollToSports() {
		return name + " is enrolled to Cricket. Having age " + age + " from Sem " + sem;
	}

	public String enrollToNCC() {
		return "nothing";

	}

}

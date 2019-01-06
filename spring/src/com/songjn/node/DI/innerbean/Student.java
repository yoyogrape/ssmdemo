package com.songjn.node.DI.innerbean;

/**
 * @author songjn
 * @date Sep 1, 2018 - 10:02:39 PM
 * @desc setter×¢Èë
 */
public class Student {
	private String name;
	private int age;
	private School school;
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", school=" + school.getName()
				+ "]";
	}

}

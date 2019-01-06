package com.songjn.node.DI.multixml.equal;

/**
 * @author songjn
 * @date Sep 2, 2018 - 2:14:33 PM
 */
public class Teacher {
	private String name;
	private int age;
	private String school;
	private String major;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + ", school=" + school
				+ ", major=" + major + "]";
	}

}

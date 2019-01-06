package com.songjn.po;

public class Student {
	private int id;
	private int age;
	private String name;
	private double score;
	
	public Student() {
		super();
	}
	
	public Student(int age, String name, double score) {
		super();
		this.age = age;
		this.name = name;
		this.score = score;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", id=" + id + ", name=" + name
				+ ", score=" + score + "]";
	}


}

package com.songjn.node.mybatis.po;

public class Student {
	private int id;
	private String name;
	private int age;
	private double score;

	public Student() {
		super();
	}

	public Student(String name, int age, double score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String toString() {
		return "Student [age=" + age + ", id=" + id + ", name=" + name
				+ ", score=" + score + "]";
	}

}

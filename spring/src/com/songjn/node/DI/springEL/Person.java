package com.songjn.node.DI.springEL;

/**
 * @author songjn
 * @date Sep 2, 2018 - 10:42:59 AM
 */
public class Person {
	private String p_name;
	private int p_age;

	public Person() {
		super();
	}

	public Person(String p_name, int p_age) {
		super();
		this.p_name = p_name;
		this.p_age = p_age;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public int getP_age() {
		return p_age;
	}

	public void setP_age(int p_age) {
		this.p_age = p_age;
	}

	public int setProcessAge() {
		// this.age = age > 18 ? 18 : age;
		return p_age > 18 ? 18 : p_age;
	}

	@Override
	public String toString() {
		return "Person [p_name=" + p_name + ", p_age=" + p_age + "]";
	}

}

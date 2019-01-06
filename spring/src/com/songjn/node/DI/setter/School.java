package com.songjn.node.DI.setter;

/**
 * @author songjn
 * @date Sep 1, 2018 - 10:17:22 PM
 * @desc
 */
public class School {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "School [name=" + name + "]";
	}
	
}

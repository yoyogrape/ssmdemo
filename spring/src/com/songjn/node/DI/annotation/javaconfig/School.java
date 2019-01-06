package com.songjn.node.DI.annotation.javaconfig;

/**
 * @author songjn
 * @date Sep 1, 2018 - 10:17:22 PM
 */
public class School {
	private String name;
	
	public School() {
		super();
	}

	public School(String name) {
		super();
		this.name = name;
	}

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

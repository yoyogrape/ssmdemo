package com.songjn.node.staticfactory;

public class ServiceFactory {
	public static ISomeService getSomeServiceImpl() {
		return new SomeServiceImpl();
	}
}

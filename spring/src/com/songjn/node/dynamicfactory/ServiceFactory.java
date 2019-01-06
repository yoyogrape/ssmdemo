package com.songjn.node.dynamicfactory;

public class ServiceFactory {
	public ISomeService getSomeServiceImpl() {
		return new SomeServiceImpl();
	}
}

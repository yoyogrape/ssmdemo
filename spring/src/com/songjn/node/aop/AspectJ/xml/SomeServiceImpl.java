package com.songjn.node.aop.AspectJ.xml;

public class SomeServiceImpl implements ISomeService {
	public void doFirst() {
		System.out.println("ִ��doFirst����������");
	}

	public void doSecond() {
		System.out.println("ִ��doSecond����������");
	}

	public String doThird() {
		System.out.println("ִ��doThird����������");
		return "abcd";
	}
}

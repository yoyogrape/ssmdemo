package com.songjn.node.aop.methodinterceptor;

public class SomeServiceImpl implements ISomeService {
	public void doFirst() {
		System.out.println("ִ��doFirst����������");
	}
	public String doSecond() {
		System.out.println("ִ��doSecond����������");
		return "abcd";
	}
}

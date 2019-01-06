package com.songjn.node.aop.methodinterceptor;

public class SomeServiceImpl implements ISomeService {
	public void doFirst() {
		System.out.println("执行doFirst（）方法！");
	}
	public String doSecond() {
		System.out.println("执行doSecond（）方法！");
		return "abcd";
	}
}

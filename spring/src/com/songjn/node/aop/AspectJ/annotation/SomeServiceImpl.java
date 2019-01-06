package com.songjn.node.aop.AspectJ.annotation;

public class SomeServiceImpl implements ISomeService {
	public void doFirst() {
		System.out.println("执行doFirst（）方法！");
	}

	public void doSecond() {
		System.out.println("执行doSecond（）方法！");
	}

	public String doThird() {
		System.out.println("执行doThird（）方法！" + 3 / 0);
		return "abcd";
	}
}

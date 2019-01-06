package com.songjn.node.aop.advices;

public class SomeServiceImpl implements ISomeService {
	public void doFirst() {
		System.out.println("执行doFirst（）方法！");
	}
	public void doSecond() {
		System.out.println("执行doSecond（）方法！");
	}
}

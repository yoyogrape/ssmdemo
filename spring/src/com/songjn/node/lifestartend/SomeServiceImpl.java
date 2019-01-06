package com.songjn.node.lifestartend;

public class SomeServiceImpl implements ISomeService {

	public SomeServiceImpl() {
		System.out.println("执行了构造方法");
	}

	public void doSome() {
		System.out.println("执行了doSome（）方法！");
	}

	public void setUp() {
		System.out.println("生命开始！");
	}

	public void tearDown() {
		System.out.println("生命结束！");
	}
}

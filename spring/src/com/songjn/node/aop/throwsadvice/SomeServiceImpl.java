package com.songjn.node.aop.throwsadvice;

public class SomeServiceImpl implements ISomeService {
	public void doFirst() {
		System.out.println("ִ��doFirst����������");
	}
	public void doSecond() {
		System.out.println("ִ��doSecond����������"+3/0);
		
	}
}

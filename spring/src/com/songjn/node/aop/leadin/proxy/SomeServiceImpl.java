package com.songjn.node.aop.leadin.proxy;

public class SomeServiceImpl implements ISomeService {

	public void doFirst() {
		// SystemService.doTx();
		System.out.println("ִ��doFirst����������");
		// SystemService.doLog();
	}

	public void doSecond() {
		// SystemService.doTx();
		System.out.println("ִ��doSecond����������");
		// SystemService.doLog();
	}

}

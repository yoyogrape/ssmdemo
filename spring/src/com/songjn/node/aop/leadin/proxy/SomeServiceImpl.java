package com.songjn.node.aop.leadin.proxy;

public class SomeServiceImpl implements ISomeService {

	public void doFirst() {
		// SystemService.doTx();
		System.out.println("执行doFirst（）方法！");
		// SystemService.doLog();
	}

	public void doSecond() {
		// SystemService.doTx();
		System.out.println("执行doSecond（）方法！");
		// SystemService.doLog();
	}

}

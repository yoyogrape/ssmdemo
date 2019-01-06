package com.songjn.node.aop.leadin.proxy;

/**
 * @author songjn
 * @date Sep 3, 2018 - 8:31:31 AM
 * @desc 工具类，执行事务和日志
 * 
 * 1、第一种解决方案，工具类实现。
 * 缺点：和主业务逻辑写到一起，业务逻辑混杂。
 */
//主业务接口
public class SystemService {
	//目标方法
	public static void doTx() {
		System.out.println("执行事务代码！");
	}

	//目标方法
	public static void doLog() {
		System.out.println("执行日志代码！");
	}
}

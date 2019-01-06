package com.songjn.node.aop.throwsadvice;

import org.springframework.aop.ThrowsAdvice;

/**
 * @author songjn
 * @date Sep 3, 2018 - 10:46:01 AM
 * @desc 异常通知
 */
public class MyThrowsAdvice implements ThrowsAdvice {
	//当目标方法抛出与指定类型的异常具有is-a关系的异常时执行
	public void afterThrowing(Exception ex) {
		System.out.println("执行异常通知方法");
	}
}

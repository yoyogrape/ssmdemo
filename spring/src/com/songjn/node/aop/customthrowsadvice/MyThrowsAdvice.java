package com.songjn.node.aop.customthrowsadvice;

import org.springframework.aop.ThrowsAdvice;

/**
 * @author songjn
 * @date Sep 3, 2018 - 10:46:01 AM
 * @desc 异常通知
 */
public class MyThrowsAdvice implements ThrowsAdvice {
	//当目标方法抛出用户名异常执行
	public void afterThrowing(UsernameException ex) {
		System.out.println("发生用户名异常:"+ex.getMessage());
	}
	//当目标方法抛出密码异常时执行
	public void afterThrowing(PasswordException ex) {
		System.out.println("发生密码异常:"+ex.getMessage());
	}
}

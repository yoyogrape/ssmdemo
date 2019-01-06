package com.songjn.node.aop.afterreturningadvice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

/**
 * @author songjn
 * @date Sep 3, 2018 - 10:24:28 AM
 * @desc 后置通知
 */
public class MyAfterReturningAdvice implements AfterReturningAdvice {
	//在目标方法执行之后执行
	//returnValue:目标方法的返回值
	//method:目标方法
	//args:目标方法的参数列表
	//target：目标对象
	//注意：不能改变其放回结果
	public void afterReturning(Object returnValue, Method method,
			Object[] args, Object target) throws Throwable {
		System.out.println("执行后置通知方法");
	}
}

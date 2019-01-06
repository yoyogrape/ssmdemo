package com.songjn.node.aop.advisor;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * @author songjn
 * @date Sep 3, 2018 - 9:16:51 AM
 * @desc 前置通知实现类
 */
public class MyMethodBeforeAdvice implements MethodBeforeAdvice {
	//当前方法在目标方法执行之前执行
	//method:目标方法
	//args:目标方法的参数列表
	//target：目标对象
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		//对目标方法的增强
		System.out.println("执行前置通知方法");
	}
}

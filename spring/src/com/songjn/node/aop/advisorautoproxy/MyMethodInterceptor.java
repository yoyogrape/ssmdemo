package com.songjn.node.aop.advisorautoproxy;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author songjn
 * @date Sep 3, 2018 - 10:33:02 AM
 * @desc 环绕通知，可以修改返回结果的返回值
 */
public class MyMethodInterceptor implements MethodInterceptor {

	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("执行环绕通知：目标方法执行之前。");
		Object result = invocation.proceed();
		System.out.println("执行环绕通知：目标方法执行之后。");
		//处理结果，将结果返回值变成大写
		if (result!=null) {
			result = ((String) result).toUpperCase();
		}
		return result;
	}
}

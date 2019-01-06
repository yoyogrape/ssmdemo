package com.songjn.node.aop.leadin.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * aop引入，底层 代理模式示例
 * 
 * 有业务需求：执行主业务前增加事务，执行主业务后增加日志。 
 * 有两种方法： 
 * 1、工具类SystemService中定义静态方法实现 
 * 2、代理模式
 */
public class MyTest {

	public static void main(String[] args) {
		final ISomeService target = new SomeServiceImpl();
		ISomeService service = (ISomeService) Proxy.newProxyInstance(target
				.getClass().getClassLoader(),
				target.getClass().getInterfaces(), new InvocationHandler() {
					//织入weaving：将系统级服务切入到主业务逻辑中
					public Object invoke(Object proxy, Method method,
							Object[] args) throws Throwable {
						SystemService.doTx();
						//执行目标方法
						Object result = method.invoke(target, args);
						SystemService.doLog();
						return result;
					}
				});

		service.doFirst();
		System.out.println("=================");
		service.doSecond();
	}

}

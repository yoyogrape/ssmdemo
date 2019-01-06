package com.songjn.node.beanafterprocessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * bean后处理器的应用 利用代理反射对方法进行处理
 */
public class MyBeanProcessor implements BeanPostProcessor {

	// bean表示当前正在初始化的bean对象
	// beanName当前正在初始化的对象的id
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("----" + bean.getClass().getName()
				+ "执行----before---（）方法");
		return bean;
	}

	public Object postProcessAfterInitialization(final Object bean,
			String beanName) throws BeansException {
		System.out.println("----" + bean.getClass().getName()
				+ "执行----after---（）方法");
		if ("myService".equals(beanName)) {
			Object obj = Proxy.newProxyInstance(
					bean.getClass().getClassLoader(), 
					bean.getClass().getInterfaces(),
					new InvocationHandler() {
						public Object invoke(Object proxy, Method method,
								Object[] args) throws Throwable {
							Object invoke = method.invoke(bean, args);
							if ("doSome".equals(method.getName())) {
								return ((String) invoke).toUpperCase();
							}
							return (String) invoke;
						}
					});
			return obj;
		}
		return bean;
	}
}

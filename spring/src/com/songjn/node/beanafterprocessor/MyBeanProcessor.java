package com.songjn.node.beanafterprocessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * bean��������Ӧ�� ���ô�����Է������д���
 */
public class MyBeanProcessor implements BeanPostProcessor {

	// bean��ʾ��ǰ���ڳ�ʼ����bean����
	// beanName��ǰ���ڳ�ʼ���Ķ����id
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("----" + bean.getClass().getName()
				+ "ִ��----before---��������");
		return bean;
	}

	public Object postProcessAfterInitialization(final Object bean,
			String beanName) throws BeansException {
		System.out.println("----" + bean.getClass().getName()
				+ "ִ��----after---��������");
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

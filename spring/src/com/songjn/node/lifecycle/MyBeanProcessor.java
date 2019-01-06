package com.songjn.node.lifecycle;

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
		System.out.println("step5：执行bean后处理器的postProcessBeforeInitialization方法，bean初始化完毕之前执行。");
		return bean;
	}

	public Object postProcessAfterInitialization(final Object bean,
			String beanName) throws BeansException {
		System.out.println("step8：执行bean后处理器的postProcessAfterInitialization方法，bean初始化完毕之后执行。");
		return bean;
	}
}

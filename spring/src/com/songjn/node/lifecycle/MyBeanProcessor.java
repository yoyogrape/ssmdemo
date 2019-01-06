package com.songjn.node.lifecycle;

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
		System.out.println("step5��ִ��bean��������postProcessBeforeInitialization������bean��ʼ�����֮ǰִ�С�");
		return bean;
	}

	public Object postProcessAfterInitialization(final Object bean,
			String beanName) throws BeansException {
		System.out.println("step8��ִ��bean��������postProcessAfterInitialization������bean��ʼ�����֮��ִ�С�");
		return bean;
	}
}

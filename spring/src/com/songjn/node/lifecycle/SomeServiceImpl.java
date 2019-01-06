package com.songjn.node.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SomeServiceImpl implements ISomeService, BeanNameAware,BeanFactoryAware, InitializingBean,DisposableBean {
	private String name;

	public SomeServiceImpl() {
		System.out.println("step1��ִ�й��췽��");
	}

	public void setName(String name) {
		System.out.println("step2��ִ��setter����");
		this.name = name;
	}

	public void doSome() {
		System.out.println("step9��ִ��ҵ�񷽷�doSome---��ʷʹ��");
	}

	public void setUp() {
		System.out.println("step7������ʼĩ�Ŀ�ʼ���ڳ�ʼ�����֮�󣬷���ִ��֮ǰִ�С�");
	}

	public void tearDown() {
		System.out.println("step11������ʼĩ��ĩβ��������֮ǰִ��---��������");
	}

	public void setBeanName(String name) {
		System.out.println("step3��ִ��BeanNameAware�ӿڵ�setBeanName��������ȡbean Id="+ name);
	}

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("step4��ִ��BeanFactoryAware�ӿڵ�setBeanFactory��������ȡbeanFactory����");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("step6��ִ��InitializingBean�ӿڵ�afterPropertiesSet������bean��ʼ��������ˡ�");
	}

	public void destroy() throws Exception {
		System.out.println("step10��ִ��DisposableBean�ӿڵ�destroy����������֮ǰ��");
	}
}

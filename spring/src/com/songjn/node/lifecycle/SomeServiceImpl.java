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
		System.out.println("step1：执行构造方法");
	}

	public void setName(String name) {
		System.out.println("step2：执行setter方法");
		this.name = name;
	}

	public void doSome() {
		System.out.println("step9：执行业务方法doSome---历史使命");
	}

	public void setUp() {
		System.out.println("step7：生命始末的开始，在初始化完毕之后，方法执行之前执行。");
	}

	public void tearDown() {
		System.out.println("step11：生命始末的末尾，在销毁之前执行---最后的遗言");
	}

	public void setBeanName(String name) {
		System.out.println("step3：执行BeanNameAware接口的setBeanName方法。获取bean Id="+ name);
	}

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("step4：执行BeanFactoryAware接口的setBeanFactory方法。获取beanFactory容器");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("step6：执行InitializingBean接口的afterPropertiesSet方法。bean初始化化完毕了。");
	}

	public void destroy() throws Exception {
		System.out.println("step10：执行DisposableBean接口的destroy方法。销毁之前。");
	}
}

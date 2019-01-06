package com.songjn.node.lifecycle;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * bean ������ʼĩ
 * ��������������doEnd����ִ����Ҫ����������  
 * 1��bean�ǵ��� 
 * 2����Ҫ�ֶ��ر�����
 */
public class MyTest {
	@Test
	public void test06() {
		String myResource = "com/songjn/node/lifecycle/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(myResource);
		ISomeService service = (ISomeService) ac.getBean("myService");
		service.doSome();
		// �ֶ��ر����������ܵ���doEnd������
		((ClassPathXmlApplicationContext) ac).close();
	}
	// step1��ִ�й��췽��
	// step2��ִ��setter����
	// step3��ִ��BeanNameAware�ӿڵ�setBeanName��������ȡbean Id=myService
	// step4��ִ��BeanFactoryAware�ӿڵ�setBeanFactory��������ȡbeanFactory����
	// step5��ִ��bean��������postProcessBeforeInitialization������bean��ʼ�����֮ǰִ�С�
	// step6��ִ��InitializingBean�ӿڵ�afterPropertiesSet������bean��ʼ��������ˡ�
	// step7������ʼĩ�Ŀ�ʼ���ڳ�ʼ�����֮�󣬷���ִ��֮ǰִ�С�
	// step8��ִ��bean��������postProcessAfterInitialization������bean��ʼ�����֮��ִ�С�
	// step9��ִ��ҵ�񷽷�doSome---��ʷʹ��
	// step10��ִ��DisposableBean�ӿڵ�destroy����������֮ǰ��
	// step11������ʼĩ��ĩβ��������֮ǰִ��---��������
}

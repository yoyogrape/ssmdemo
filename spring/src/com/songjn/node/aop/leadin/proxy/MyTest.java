package com.songjn.node.aop.leadin.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * aop���룬�ײ� ����ģʽʾ��
 * 
 * ��ҵ������ִ����ҵ��ǰ��������ִ����ҵ���������־�� 
 * �����ַ����� 
 * 1��������SystemService�ж��徲̬����ʵ�� 
 * 2������ģʽ
 */
public class MyTest {

	public static void main(String[] args) {
		final ISomeService target = new SomeServiceImpl();
		ISomeService service = (ISomeService) Proxy.newProxyInstance(target
				.getClass().getClassLoader(),
				target.getClass().getInterfaces(), new InvocationHandler() {
					//֯��weaving����ϵͳ���������뵽��ҵ���߼���
					public Object invoke(Object proxy, Method method,
							Object[] args) throws Throwable {
						SystemService.doTx();
						//ִ��Ŀ�귽��
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

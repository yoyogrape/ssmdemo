package com.songjn.node.aop.advisor;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * @author songjn
 * @date Sep 3, 2018 - 9:16:51 AM
 * @desc ǰ��֪ͨʵ����
 */
public class MyMethodBeforeAdvice implements MethodBeforeAdvice {
	//��ǰ������Ŀ�귽��ִ��֮ǰִ��
	//method:Ŀ�귽��
	//args:Ŀ�귽���Ĳ����б�
	//target��Ŀ�����
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		//��Ŀ�귽������ǿ
		System.out.println("ִ��ǰ��֪ͨ����");
	}
}

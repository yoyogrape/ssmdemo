package com.songjn.node.aop.afterreturningadvice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

/**
 * @author songjn
 * @date Sep 3, 2018 - 10:24:28 AM
 * @desc ����֪ͨ
 */
public class MyAfterReturningAdvice implements AfterReturningAdvice {
	//��Ŀ�귽��ִ��֮��ִ��
	//returnValue:Ŀ�귽���ķ���ֵ
	//method:Ŀ�귽��
	//args:Ŀ�귽���Ĳ����б�
	//target��Ŀ�����
	//ע�⣺���ܸı���Żؽ��
	public void afterReturning(Object returnValue, Method method,
			Object[] args, Object target) throws Throwable {
		System.out.println("ִ�к���֪ͨ����");
	}
}

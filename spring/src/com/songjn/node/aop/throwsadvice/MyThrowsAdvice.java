package com.songjn.node.aop.throwsadvice;

import org.springframework.aop.ThrowsAdvice;

/**
 * @author songjn
 * @date Sep 3, 2018 - 10:46:01 AM
 * @desc �쳣֪ͨ
 */
public class MyThrowsAdvice implements ThrowsAdvice {
	//��Ŀ�귽���׳���ָ�����͵��쳣����is-a��ϵ���쳣ʱִ��
	public void afterThrowing(Exception ex) {
		System.out.println("ִ���쳣֪ͨ����");
	}
}

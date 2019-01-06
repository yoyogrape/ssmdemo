package com.songjn.node.aop.customthrowsadvice;

import org.springframework.aop.ThrowsAdvice;

/**
 * @author songjn
 * @date Sep 3, 2018 - 10:46:01 AM
 * @desc �쳣֪ͨ
 */
public class MyThrowsAdvice implements ThrowsAdvice {
	//��Ŀ�귽���׳��û����쳣ִ��
	public void afterThrowing(UsernameException ex) {
		System.out.println("�����û����쳣:"+ex.getMessage());
	}
	//��Ŀ�귽���׳������쳣ʱִ��
	public void afterThrowing(PasswordException ex) {
		System.out.println("���������쳣:"+ex.getMessage());
	}
}

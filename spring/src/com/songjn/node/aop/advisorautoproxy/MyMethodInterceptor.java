package com.songjn.node.aop.advisorautoproxy;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author songjn
 * @date Sep 3, 2018 - 10:33:02 AM
 * @desc ����֪ͨ�������޸ķ��ؽ���ķ���ֵ
 */
public class MyMethodInterceptor implements MethodInterceptor {

	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("ִ�л���֪ͨ��Ŀ�귽��ִ��֮ǰ��");
		Object result = invocation.proceed();
		System.out.println("ִ�л���֪ͨ��Ŀ�귽��ִ��֮��");
		//�����������������ֵ��ɴ�д
		if (result!=null) {
			result = ((String) result).toUpperCase();
		}
		return result;
	}
}

package com.songjn.node.aop.leadin.proxy;

/**
 * @author songjn
 * @date Sep 3, 2018 - 8:31:31 AM
 * @desc �����ִ࣬���������־
 * 
 * 1����һ�ֽ��������������ʵ�֡�
 * ȱ�㣺����ҵ���߼�д��һ��ҵ���߼����ӡ�
 */
//��ҵ��ӿ�
public class SystemService {
	//Ŀ�귽��
	public static void doTx() {
		System.out.println("ִ��������룡");
	}

	//Ŀ�귽��
	public static void doLog() {
		System.out.println("ִ����־���룡");
	}
}

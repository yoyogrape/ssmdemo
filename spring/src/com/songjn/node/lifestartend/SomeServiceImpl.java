package com.songjn.node.lifestartend;

public class SomeServiceImpl implements ISomeService {

	public SomeServiceImpl() {
		System.out.println("ִ���˹��췽��");
	}

	public void doSome() {
		System.out.println("ִ����doSome����������");
	}

	public void setUp() {
		System.out.println("������ʼ��");
	}

	public void tearDown() {
		System.out.println("����������");
	}
}

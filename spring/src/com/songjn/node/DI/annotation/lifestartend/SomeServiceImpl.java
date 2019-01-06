package com.songjn.node.DI.annotation.lifestartend;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Service;

@Service("myService")
public class SomeServiceImpl implements ISomeService {

	public SomeServiceImpl() {
		System.out.println("ִ���˹��췽��");
	}

	public void doSome() {
		System.out.println("ִ����doSome����������");
	}

	@PostConstruct
	public void setUp() {
		System.out.println("������ʼ��");
	}

	@PreDestroy
	public void tearDown() {
		System.out.println("����������");
	}
}

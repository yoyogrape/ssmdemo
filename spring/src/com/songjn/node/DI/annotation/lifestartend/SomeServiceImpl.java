package com.songjn.node.DI.annotation.lifestartend;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Service;

@Service("myService")
public class SomeServiceImpl implements ISomeService {

	public SomeServiceImpl() {
		System.out.println("执行了构造方法");
	}

	public void doSome() {
		System.out.println("执行了doSome（）方法！");
	}

	@PostConstruct
	public void setUp() {
		System.out.println("生命开始！");
	}

	@PreDestroy
	public void tearDown() {
		System.out.println("生命结束！");
	}
}

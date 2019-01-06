package com.songjn.node.beanafterprocessor;

public class SomeServiceImpl implements ISomeService {
	
	public SomeServiceImpl() {
		System.out.println("执行无参构造器！");
	}
	public String doSome() {
		return "haha";
	}
	public String doOther() {
		return "xixi";
	}

}

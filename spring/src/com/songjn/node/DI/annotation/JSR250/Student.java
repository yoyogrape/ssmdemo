package com.songjn.node.DI.annotation.JSR250;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author songjn
 * @date Sep 1, 2018 - 10:02:39 PM
 */
//@Component(value="myStudent")
@Component("myStudent")//当只有value的时候，直接写字符串
public class Student {
	@Value("小明")
	private String name;
	@Value("25")
	private int age;
	
//	@Resource  //byType方式的注解注入(采用is-a关系，类型不能多于1个 )
	@Resource(name="mySchool")  //byName方式的注解注入
	private School school;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", school=" + school
				+ "]";
	}


}

package com.songjn.node.DI.annotation.JSR250;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author songjn
 * @date Sep 1, 2018 - 10:02:39 PM
 */
//@Component(value="myStudent")
@Component("myStudent")//��ֻ��value��ʱ��ֱ��д�ַ���
public class Student {
	@Value("С��")
	private String name;
	@Value("25")
	private int age;
	
//	@Resource  //byType��ʽ��ע��ע��(����is-a��ϵ�����Ͳ��ܶ���1�� )
	@Resource(name="mySchool")  //byName��ʽ��ע��ע��
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

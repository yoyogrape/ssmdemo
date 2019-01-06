package com.songjn.node.springjdbc.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.songjn.node.springjdbc.po.Student;
import com.songjn.node.springjdbc.service.IStudentService;

/**
 * springJdbc实现增删改查
 */
public class MyTest {
	private IStudentService service;

	@Before
	public void before() {
		String myResource = "applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(myResource);
		service = (IStudentService) ac.getBean("myService");
	}

	@Test
	public void add() {
		service.addStudnet(new Student("张好2", 25));
	}

	@Test
	public void del() {
		service.removeById(7);
	}

	@Test
	public void update() {
		service.modifyStudent(new Student(1, "李四", 30));
	}

	@Test
	public void findNames() {
		List<String> nameStrings = service.findAllStudnetsName();
		for (String name : nameStrings) {
			System.out.println(name);
		}
	}

	@Test
	public void findNamesById() {
		String name = service.findStudnetNameById(8);
		System.out.println(name);
	}
	@Test
	public void findAll() {
		List<Student> students = service.findAllStudnets();
		for (Student student : students) {
			System.out.println(student);
		}
	}
	@Test
	public void findStudentById() {
		Student student = service.findStudnetById(1);
		System.out.println(student);
	}
}

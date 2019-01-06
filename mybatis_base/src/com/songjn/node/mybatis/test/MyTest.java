package com.songjn.node.mybatis.test;

import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.songjn.node.mybatis.dao.IStudentDao;
import com.songjn.node.mybatis.dao.Impl.StudnetDaoImpl;
import com.songjn.node.mybatis.po.Student;

/**
 * mybatis����ʵ�����д��
 */
public class MyTest {
	private IStudentDao dao;

	@Before
	public void before() {
		dao = new StudnetDaoImpl();
	}

	@Test
	public void add() {// ִ�в��뷽��
		dao.insertStudnet(new Student("С��", 12, 98));
	}

	@Test
	public void addChche() {// ִ�в��룬����ǰid=null�������id=�ǿա�
		dao.insertStudnetCacheId(new Student("С��3333", 14, 12));
		// ִ�в���ǰ��Student=Student [age=14, id=0, name=С��3333, score=12.0]
		// ִ�в�����Student=Student [age=14, id=27, name=С��3333, score=12.0]

	}

	@Test
	public void del() {
		dao.deleteStudentById(30);
	}

	@Test
	public void update() {
		Student student = new Student("����", 12, 77);
		student.setId(29);
		dao.updateStudent(student);
	}

	@Test
	public void select() {
		List<Student> list = dao.selectAllStudnets();
		for (Student student : list) {
			System.out.println(student);
		}
	}
	@Test
	public void selectMap() {
		Map<String, Object> map = dao.selectAllStudnetsMap();
		System.out.println(map.get("xixi"));
	}

	@Test
	public void selectById() {
		System.out.println(dao.selectStudnetById(3));
	}
	@Test
	public void selectByName() {
		List<Student> list = dao.selectStudnetsByName("С");
		for (Student student : list) {
			System.out.println(student);
		}
	}
}

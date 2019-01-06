package com.songjn.node.mybatis.test;

import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.songjn.node.mybatis.dao.IStudentDao;
import com.songjn.node.mybatis.dao.Impl.StudnetDaoImpl;
import com.songjn.node.mybatis.po.Student;

/**
 * mybatis，有实现类的写法
 */
public class MyTest {
	private IStudentDao dao;

	@Before
	public void before() {
		dao = new StudnetDaoImpl();
	}

	@Test
	public void add() {// 执行插入方法
		dao.insertStudnet(new Student("小明", 12, 98));
	}

	@Test
	public void addChche() {// 执行插入，插入前id=null，插入后id=非空。
		dao.insertStudnetCacheId(new Student("小明3333", 14, 12));
		// 执行插入前的Student=Student [age=14, id=0, name=小明3333, score=12.0]
		// 执行插入后的Student=Student [age=14, id=27, name=小明3333, score=12.0]

	}

	@Test
	public void del() {
		dao.deleteStudentById(30);
	}

	@Test
	public void update() {
		Student student = new Student("花花", 12, 77);
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
		List<Student> list = dao.selectStudnetsByName("小");
		for (Student student : list) {
			System.out.println(student);
		}
	}
}

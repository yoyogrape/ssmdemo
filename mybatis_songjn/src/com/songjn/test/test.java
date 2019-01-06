package com.songjn.test;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.songjn.dao.IStudentDao;
import com.songjn.po.Student;
import com.songjn.utils.MyBatisUtil;

public class test {
	private IStudentDao dao;
	private SqlSession session;
	@Before
	public void before(){
		session=MyBatisUtil.getSqlSession();
		dao=session.getMapper(IStudentDao.class);
	}
	@After
	public void after() {
		if (session != null) {
			session.close();
		}
	}
	@Test
	public void insert(){
		dao.insertStudent(new Student(23,"meimei",98));
		session.commit();
	}
	@Test
	public void del(){
		dao.delStudentById(33);
		session.commit();
	}
	@Test
	public void update(){
		Student student=new Student(23,"»¨»¨",98);
		student.setId(34);
		dao.updateStudent(student);
		session.commit();
	}
	@Test
	public void selectAll(){
		List<Student> list=new ArrayList<Student>();
		list=dao.selectAll();
		for (Student student : list) {
			System.out.println(student);
		}
	}
	
}

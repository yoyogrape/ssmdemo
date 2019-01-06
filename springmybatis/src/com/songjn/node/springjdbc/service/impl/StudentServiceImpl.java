package com.songjn.node.springjdbc.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.songjn.node.springjdbc.dao.IStudentDao;
import com.songjn.node.springjdbc.po.Student;
import com.songjn.node.springjdbc.service.IStudentService;

public class StudentServiceImpl implements IStudentService {

	private IStudentDao dao;

	public void setDao(IStudentDao dao) {
		this.dao = dao;
	}

	@Override
	public void addStudnet(Student student) {
		dao.insertStudnet(student);
	}

	@Override
	public void removeById(int id) {
		dao.deleteById(id);
	}

	@Override
	public void modifyStudent(Student student) {
		dao.updateStudent(student);
	}

	@Override
	public List<Student> findAllStudnets() {
		List<Student> students = dao.selectAllStudnets();
		return students;
	}

	@Override
	public List<String> findAllStudnetsName() {
		List<String> list=new ArrayList<String>();
		List<Student> students=dao.selectAllStudnets();
		for (Student student : students) {
			list.add(student.getName());
		}
		return list;
	}

	@Override
	public Student findStudnetById(int id) {
		Student student=dao.selectStudnetById(id);
		return student;
	}

	@Override
	public String findStudnetNameById(int id) {
		Student student=dao.selectStudnetById(id);
		return student.getName();
	}

}

package com.songjn.node.springjdbc.dao;

import java.util.List;

import com.songjn.node.springjdbc.po.Student;

public interface IStudentDao {
	void insertStudnet(Student student);

	void deleteById(int id);

	void updateStudent(Student student);

	List<Student> selectAllStudnets();

	Student selectStudnetById(int id);
}

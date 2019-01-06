package com.songjn.dao;

import java.util.List;

import com.songjn.po.Student;

public interface IStudentDao {
	void insertStudent(Student s);

	void delStudentById(int id);

	void delStudentByIds(int[] ids);

	void updateStudent(Student s);

	List<Student> selectAll();

	Student selectStudentById();

	List<Student> selectStudentCondition();

}

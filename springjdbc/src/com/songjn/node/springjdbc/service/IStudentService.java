package com.songjn.node.springjdbc.service;

import java.util.List;

import com.songjn.node.springjdbc.po.Student;

public interface IStudentService {
	void addStudnet(Student student);
	void removeById(int id);
	void modifyStudent(Student student);
	
	List<String> findAllStudnetsName();
	String findStudnetNameById(int id);
	
	List<Student> findAllStudnets();
	Student findStudnetById(int id);
}

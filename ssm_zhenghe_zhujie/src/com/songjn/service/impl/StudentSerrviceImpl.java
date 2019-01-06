package com.songjn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.songjn.dao.IStudentDao;
import com.songjn.po.Student;
import com.songjn.service.IStudentSerrvice;
@Service
public class StudentSerrviceImpl implements IStudentSerrvice {
	@Autowired
	private IStudentDao dao;
	public void addStudent(Student student) {
		System.out.println("...StudentSerrviceImpl...addStudent...");
		dao.insertStudent(student);
	}

}

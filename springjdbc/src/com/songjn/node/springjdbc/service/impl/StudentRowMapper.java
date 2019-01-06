package com.songjn.node.springjdbc.service.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.songjn.node.springjdbc.po.Student;

public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet resSet, int arg1) throws SQLException {
		Student student=new Student();
		student.setId(resSet.getInt("id"));
		student.setName(resSet.getString("name"));
		student.setAge(resSet.getInt("age"));
		return student;
	}

}

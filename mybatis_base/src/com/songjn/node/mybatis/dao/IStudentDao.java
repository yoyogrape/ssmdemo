package com.songjn.node.mybatis.dao;

import java.util.List;
import java.util.Map;

import com.songjn.node.mybatis.po.Student;

public interface IStudentDao {

	public void insertStudnet(Student student);

	public void insertStudnetCacheId(Student student);

	public void deleteStudentById(int id);

	public void updateStudent(Student student);

	public List<Student> selectAllStudnets();
	public Map<String,Object> selectAllStudnetsMap();

	public Student selectStudnetById(int id);
	public List<Student> selectStudnetsByName(String name);
}

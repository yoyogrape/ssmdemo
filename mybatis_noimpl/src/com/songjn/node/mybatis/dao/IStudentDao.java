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
	public List<Student> selectByConditions(Map<String, Object> map);
	
	public List<Student> selectDynamicSqlByIf(Student student);
	public List<Student> selectDynamicSqlByWhere(Student student);
	
	public List<Student> selectDynamicSqlByChoose(Student student);
	
	public List<Student> selectDynamicSqlByForeach(int[] ids);
	public List<Student> selectDynamicSqlByForeach2(List<Integer> ids);
	//泛型是自定义类型的list
	public List<Student> selectDynamicSqlByForeach3(List<Student> ids);
	//sql片段的使用
	public List<Student> selectDynamicSqlByForeach4(List<Student> ids);
}

package com.mybatis.dao;

import java.util.List;

import com.mybatis.bean.Employee;

public interface EmployeeDAO {

	//根据id查询雇员信息，同时附带所属的部门信息
	public List<Employee> getEmpById(int eid);
	
	
}

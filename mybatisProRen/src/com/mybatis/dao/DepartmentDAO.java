package com.mybatis.dao;

import com.mybatis.bean.Department;

public interface DepartmentDAO {

	//根据id查询部门信息，同时附带该部门员工信息
	public Department getDeptById(int id);
}

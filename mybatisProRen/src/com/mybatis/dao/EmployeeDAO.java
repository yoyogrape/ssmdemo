package com.mybatis.dao;

import java.util.List;

import com.mybatis.bean.Employee;

public interface EmployeeDAO {

	//����id��ѯ��Ա��Ϣ��ͬʱ���������Ĳ�����Ϣ
	public List<Employee> getEmpById(int eid);
	
	
}

package com.mybatis.test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis.bean.Employee;
import com.mybatis.dao.EmployeeDAO;

public class EmployeeTest {
	public static void main(String[] args)  {
		// 1.����mybatis�ĺ��������ļ�,·�������·��
		try {
			Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
			// 2.��ȡ���ݿ����ӳؿ��
			SqlSessionFactory factory = new SqlSessionFactoryBuilder()
					.build(reader);
			// 3.��ȡ�����ݿ������
			SqlSession session = factory.openSession();

			EmployeeDAO dao = session.getMapper(EmployeeDAO.class);

				List<Employee> list=dao.getEmpById(1);
				for(Employee e:list){
					System.out.println(e.getEname()+e.getDept().getDname());
				}
				
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

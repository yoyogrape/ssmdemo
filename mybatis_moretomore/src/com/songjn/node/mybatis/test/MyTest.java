package com.songjn.node.mybatis.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;

import com.songjn.node.mybatis.dao.IStudnetDao;
import com.songjn.node.mybatis.po.Student;
import com.songjn.node.mybatis.utils.MybatisUtils;

/**
 * mybatis�����ݱ�֮��Ĺ�����ϵ���Թ�����
 * ���һʵ�� ���󣺲�ѯ������Ŀ����Ŀ�����νṹ��
 * 
 */
public class MyTest {
	private IStudnetDao dao;
	private SqlSession session;

	@Before
	public void before() {
		session = MybatisUtils.getSqlSession();
		dao = session.getMapper(IStudnetDao.class);
	}

	@Test
	public void select() {
		Student student= dao.selectStudnet(1);
		System.out.println(student);
	}
}

package com.songjn.node.mybatis.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;

import com.songjn.node.mybatis.dao.IStudnetDao;
import com.songjn.node.mybatis.po.Student;
import com.songjn.node.mybatis.utils.MybatisUtils;

/**
 * mybatis，数据表之间的关联关系。自关联。
 * 多对一实现 需求：查询所有栏目父栏目（树形结构）
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

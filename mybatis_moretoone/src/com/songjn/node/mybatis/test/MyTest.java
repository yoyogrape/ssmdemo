package com.songjn.node.mybatis.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;

import com.songjn.node.mybatis.dao.IMinisterDao;
import com.songjn.node.mybatis.po.Minister;
import com.songjn.node.mybatis.utils.MybatisUtils;

/**
 * mybatis，数据表之间的关联关系。多对一实现
 */
public class MyTest {
	private IMinisterDao dao;
	private SqlSession session;
	@Before
	public void before() {
		session = MybatisUtils.getSqlSession();
		dao = session.getMapper(IMinisterDao.class);
	}
	@Test
	public void select() {
		Minister minister = dao.selectMinisterById(2);
		System.out.println(minister);
	}
}

package com.songjn.node.mybatis.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;

import com.songjn.node.mybatis.dao.INewsLabelDao;
import com.songjn.node.mybatis.po.NewsLabel;
import com.songjn.node.mybatis.utils.MybatisUtils;

/**
 * mybatis，数据表之间的关联关系。自关联。
 * 多对一实现 需求：查询所有栏目父栏目（树形结构）
 * 
 */
public class MyTest {
	private INewsLabelDao dao;
	private SqlSession session;

	@Before
	public void before() {
		session = MybatisUtils.getSqlSession();
		dao = session.getMapper(INewsLabelDao.class);
	}

	@Test
	public void select() {
		NewsLabel news = dao.selectParentById(7);
		System.out.println(news);
	}
}

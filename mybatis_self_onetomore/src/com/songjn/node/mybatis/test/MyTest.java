package com.songjn.node.mybatis.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;

import com.songjn.node.mybatis.dao.INewsLabelDao;
import com.songjn.node.mybatis.po.NewsLabel;
import com.songjn.node.mybatis.utils.MybatisUtils;

/**
 * mybatis，数据表之间的关联关系。自关联。一对多实现
 * 需求：查询所有栏目子孙栏目（树形结构）
 * 注意：因为是一对多实现，所以
 * 1）接口返回值是list集合
 * 2）mapper.xml中 resultMap中的是collection，而不是association
 * 3）查询所有子孙栏目所以查询语句条件是pid=#{xxx}
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
		List<NewsLabel> news = dao.selectChildByParent(1);
		for (NewsLabel n : news) {
			System.out.println(n);
		}
	}
}

package com.songjn.node.mybatis.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;

import com.songjn.node.mybatis.dao.ICountryDao;
import com.songjn.node.mybatis.po.Country;
import com.songjn.node.mybatis.utils.MybatisUtils;

/**
 * mybatis，数据表之间的关联关系。一对多实现
 */
public class MyTest {
	private ICountryDao dao;
	private SqlSession session;
	@Before
	public void before() {
		session = MybatisUtils.getSqlSession();
		dao = session.getMapper(ICountryDao.class);
	}
	@Test
	public void select() {
		List<Country> list = dao.selectCountrys(2);
		for (Country country : list) {
			System.out.println(country);
		}
	}
}

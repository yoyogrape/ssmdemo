package com.songjn.node.mybatis.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;

import com.songjn.node.mybatis.dao.ICountryDao;
import com.songjn.node.mybatis.po.Country;
import com.songjn.node.mybatis.utils.MybatisUtils;

/**
 * mybatis�����ݱ�֮��Ĺ�����ϵ��һ�Զ�ʵ��
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

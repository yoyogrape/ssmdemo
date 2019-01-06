package com.songjn.node.mybatis.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;

import com.songjn.node.mybatis.dao.INewsLabelDao;
import com.songjn.node.mybatis.po.NewsLabel;
import com.songjn.node.mybatis.utils.MybatisUtils;

/**
 * mybatis�����ݱ�֮��Ĺ�����ϵ���Թ�����һ�Զ�ʵ��
 * ���󣺲�ѯ������Ŀ������Ŀ�����νṹ��
 * ע�⣺��Ϊ��һ�Զ�ʵ�֣�����
 * 1���ӿڷ���ֵ��list����
 * 2��mapper.xml�� resultMap�е���collection��������association
 * 3����ѯ����������Ŀ���Բ�ѯ���������pid=#{xxx}
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

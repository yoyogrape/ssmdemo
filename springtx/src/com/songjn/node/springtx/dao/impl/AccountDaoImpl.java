package com.songjn.node.springtx.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.songjn.node.springtx.dao.IAccountDao;

public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao {

	@Override
	public void insertAccount(String aname, double money) {
		String sql = "insert into Account(name,money) value(?,?)";
		this.getJdbcTemplate().update(sql, aname, money);
	}

	@Override
	public void updateAccount(String aname, double money, boolean isBuy) {
		String sql = "update Account set name=? , money=money+?";
		if (isBuy) {
			sql = "update Account set name=? , money=money-?";
		}
		this.getJdbcTemplate().update(sql, aname, money);
	}

}

package com.songjn.node.springtx.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.songjn.node.springtx.dao.IStockDao;

public class StockDaoimpl extends JdbcDaoSupport implements IStockDao {

	@Override
	public void insertStock(String sname, double count) {
		String sql = "insert into stock(name,count) value(?,?)";
		this.getJdbcTemplate().update(sql, sname, count);
	}

	@Override
	public void updateStock(String sname, double count, boolean isBuy) {
		String sql = "update stock set name=?,count=count-?";
		if (isBuy) {
			sql = "update stock set name=? , count=count+?";
		}
		this.getJdbcTemplate().update(sql, sname, count);
	}

}

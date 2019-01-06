package com.songjn.node.springtx.dao;

public interface IStockDao {

	void insertStock(String sname, double count);

	void updateStock(String sname, double count,boolean isBuy);

}

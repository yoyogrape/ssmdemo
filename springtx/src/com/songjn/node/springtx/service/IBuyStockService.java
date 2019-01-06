package com.songjn.node.springtx.service;

public interface IBuyStockService {
	void openAccount(String aname, double money);

	void openStock(String sname, double acount);

	void buyStock(String aname, double money, String sname, double acount) throws Exception;
}

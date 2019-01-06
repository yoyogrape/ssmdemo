package com.songjn.node.springtx.service.impl;

import com.songjn.node.springtx.dao.IAccountDao;
import com.songjn.node.springtx.dao.IStockDao;
import com.songjn.node.springtx.service.IBuyStockService;

public class BuyStockServiceImpl implements IBuyStockService {

	private IAccountDao adao;
	private IStockDao sdao;

	public void setAdao(IAccountDao adao) {
		this.adao = adao;
	}

	public void setSdao(IStockDao sdao) {
		this.sdao = sdao;
	}

	@Override
	public void openAccount(String aname, double money) {
		this.adao.insertAccount(aname, money);
	}

	@Override
	public void openStock(String sname, double count) {
		this.sdao.insertStock(sname, count);

	}

	@Override
	public void buyStock(String aname, double money, String sname, double count) throws Exception{
		boolean isBuy = true;
		adao.updateAccount(aname, money, isBuy);
		if(1==1){
			System.out.println(3/0);
		}
		sdao.updateStock(sname, count, isBuy);
	}
}

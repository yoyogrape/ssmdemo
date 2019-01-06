package com.songjn.node.mybatis.dao;

import java.util.List;

import com.songjn.node.mybatis.po.Country;

public interface ICountryDao {
	List<Country> selectCountrys(int cid);
}

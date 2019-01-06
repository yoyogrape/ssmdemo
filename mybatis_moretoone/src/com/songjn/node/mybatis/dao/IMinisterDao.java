package com.songjn.node.mybatis.dao;

import com.songjn.node.mybatis.po.Minister;

public interface IMinisterDao {
	Minister selectMinisterById(int mid);
}

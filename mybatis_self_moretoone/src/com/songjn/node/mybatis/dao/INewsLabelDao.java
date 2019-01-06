package com.songjn.node.mybatis.dao;

import com.songjn.node.mybatis.po.NewsLabel;


public interface INewsLabelDao {
	NewsLabel selectParentById(int id);
}

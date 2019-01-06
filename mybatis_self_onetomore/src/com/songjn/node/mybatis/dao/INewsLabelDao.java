package com.songjn.node.mybatis.dao;

import java.util.List;

import com.songjn.node.mybatis.po.NewsLabel;


public interface INewsLabelDao {
	List<NewsLabel> selectChildByParent(int pid);
}

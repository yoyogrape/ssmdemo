package com.mybatis.dao;

import java.util.List;
import java.util.Map;

import com.mybatis.bean.UserInfo;

public interface UserInfoDAO {
	// 根据id查询用户信息
	public UserInfo getInfoById(Long id);
	
	//根据用户名进行模糊查询
	public List<UserInfo> getInfoByName(String username);
	
	//根据用户名和权限进行查询
	public List<UserInfo> getInfoByNamePer(UserInfo userInfo);
	
	//根据id进行删除
	public void delUserInfo(Long id);
	
	//修改的功能
	public void editUserInfoById(UserInfo userInfo);
	
	//添加数据
	public void addUserInfo(UserInfo userInfo);
	
	//根据用户名和权限进行查询（不属于同一个实体）
	public List<UserInfo> getInfo(Map<String,String> map);
	
	//查询全部用户（分页）
	public List<UserInfo> getAllByPage();
	
	//组合查询：id，username
	public List<UserInfo> getUserInfo(UserInfo user);
	
	//批量删除
	public void delUsers(Long[] ids);
	
}

package com.mybatis.dao;

import java.util.List;
import java.util.Map;

import com.mybatis.bean.UserInfo;

public interface UserInfoDAO {
	// ����id��ѯ�û���Ϣ
	public UserInfo getInfoById(Long id);
	
	//�����û�������ģ����ѯ
	public List<UserInfo> getInfoByName(String username);
	
	//�����û�����Ȩ�޽��в�ѯ
	public List<UserInfo> getInfoByNamePer(UserInfo userInfo);
	
	//����id����ɾ��
	public void delUserInfo(Long id);
	
	//�޸ĵĹ���
	public void editUserInfoById(UserInfo userInfo);
	
	//�������
	public void addUserInfo(UserInfo userInfo);
	
	//�����û�����Ȩ�޽��в�ѯ��������ͬһ��ʵ�壩
	public List<UserInfo> getInfo(Map<String,String> map);
	
	//��ѯȫ���û�����ҳ��
	public List<UserInfo> getAllByPage();
	
	//��ϲ�ѯ��id��username
	public List<UserInfo> getUserInfo(UserInfo user);
	
	//����ɾ��
	public void delUsers(Long[] ids);
	
}

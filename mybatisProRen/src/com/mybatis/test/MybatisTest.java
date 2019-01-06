package com.mybatis.test;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.mybatis.bean.UserInfo;
import com.mybatis.dao.UserInfoDAO;

public class MybatisTest {
	public static void main(String[] args) {
		try {
			// 1.����mybatis�ĺ��������ļ�,·�������·��
			Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
			// 2.��ȡ���ݿ����ӳؿ��
			SqlSessionFactory factory = new SqlSessionFactoryBuilder()
					.build(reader);
			// 3.��ȡ�����ݿ������
			SqlSession session = factory.openSession();

			UserInfoDAO dao = session.getMapper(UserInfoDAO.class);
			// ===========================================================
			/*
			//�����û�id���в�ѯ
			UserInfo user=dao.getInfoById(1L);
			System.out.println(user.getId()+"\t"+user.getUsername()+"\t"+user.getPassword());
			*/
			//===========================================================
			/*
			//�����û�������ģ����ѯ
			List<UserInfo> list=dao.getInfoByName("a");
			for(UserInfo user:list){
				System.out.println(user.getId()+"\t"+user.getUsername()+"\t"+user.getPassword());
			}
			*/
			//===========================================================
			/*
			//�����û�����Ȩ�޽��в�ѯ
			UserInfo userInfo=new UserInfo();
			userInfo.setUsername("haha");
			userInfo.setPermission("��ͨ�û�");
			List<UserInfo> list=dao.getInfoByNamePer(userInfo);
			for(UserInfo user:list){
				System.out.println(user.getId()+"\t"+user.getUsername()+"\t"+user.getPassword());
			}
			*/
			//===========================================================
			/*
			//����id����ɾ��
			try {
				dao.delUserInfo(3L);
				session.commit();
			} catch (Exception e) {
				session.rollback();
				e.printStackTrace();
			}
			*/
			//===========================================================
			/*
			//����id�޸��û���Ϣ
			UserInfo userInfo=new UserInfo();
			userInfo.setUsername("haha");
			userInfo.setPassword("1234");
			userInfo.setId(3L);
			try {
				dao.editUserInfoById(userInfo);
				session.commit();
			} catch (Exception e) {
				session.rollback();
				e.printStackTrace();
			}
			*/
			//===========================================================
			/*
			//����û���Ϣ
			UserInfo userInfo=new UserInfo();
			userInfo.setUsername("yuehan");
			userInfo.setPassword("123");
			userInfo.setPermission("����Ա");
			
			try {
				dao.addUserInfo(userInfo);
				session.commit();
			} catch (Exception e) {
				session.rollback();
				e.printStackTrace();
			}
			*/
			//===========================================================
			/*
			//�����û�����Ȩ�޽��в�ѯ��������ͬһ��ʵ�壩
			Map<String,String>map=new HashMap<String, String>();
			map.put("k_username", "haha");
			map.put("k_permession", "��ͨ�û�");
			List<UserInfo> list=dao.getInfo(map);
			for(UserInfo user:list){
				System.out.println(user.getId()+"\t"+user.getUsername()+"\t"+user.getPassword());
			}
			*/
			//===========================================================
			/*
			//��ѯȫ����Ϣ����ҳ��
			Page<UserInfo>page=PageHelper.startPage(3,3);
			dao.getAllByPage();//����ѯ�Ľ����װ��page������
			System.out.println("��"+page.getPageNum()+"ҳgetPageNum");
			System.out.println("��ҳ��ʾ"+page.size()+"������size");
			System.out.println("����"+page.getPages()+"ҳgetPages");
			System.out.println("ÿҳ��ʾ"+page.getPageSize()+"������getPageSize");
			System.out.println("��"+page.getTotal()+"������getTotal");
			List<UserInfo> list=page.getResult();
			for(UserInfo user:list){
				System.out.println(user.getId()+"\t"+user.getUsername()+"\t"+user.getPassword());
			}
			*/
			//===========================================================
			/*
			//��ϲ�ѯ
			UserInfo userInfo=new UserInfo();
			//userInfo.setId(1L);
			userInfo.setUsername("cccda");
			List<UserInfo> list=dao.getUserInfo(userInfo);
			for(UserInfo user:list){
				System.out.println(user.getId()+"\t"+user.getUsername()+"\t"+user.getPassword());
			}
			*/
			//===========================================================
			
			//����ɾ��
			Long []ids={7L,8L};
			dao.delUsers(ids);
			session.commit();
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
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
			// 1.加载mybatis的核心配置文件,路径是相对路径
			Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
			// 2.获取数据库连接池框架
			SqlSessionFactory factory = new SqlSessionFactoryBuilder()
					.build(reader);
			// 3.获取与数据库的链接
			SqlSession session = factory.openSession();

			UserInfoDAO dao = session.getMapper(UserInfoDAO.class);
			// ===========================================================
			/*
			//根据用户id进行查询
			UserInfo user=dao.getInfoById(1L);
			System.out.println(user.getId()+"\t"+user.getUsername()+"\t"+user.getPassword());
			*/
			//===========================================================
			/*
			//根据用户名进行模糊查询
			List<UserInfo> list=dao.getInfoByName("a");
			for(UserInfo user:list){
				System.out.println(user.getId()+"\t"+user.getUsername()+"\t"+user.getPassword());
			}
			*/
			//===========================================================
			/*
			//根据用户名和权限进行查询
			UserInfo userInfo=new UserInfo();
			userInfo.setUsername("haha");
			userInfo.setPermission("普通用户");
			List<UserInfo> list=dao.getInfoByNamePer(userInfo);
			for(UserInfo user:list){
				System.out.println(user.getId()+"\t"+user.getUsername()+"\t"+user.getPassword());
			}
			*/
			//===========================================================
			/*
			//根据id进行删除
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
			//根据id修改用户信息
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
			//添加用户信息
			UserInfo userInfo=new UserInfo();
			userInfo.setUsername("yuehan");
			userInfo.setPassword("123");
			userInfo.setPermission("管理员");
			
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
			//根据用户名和权限进行查询（不属于同一个实体）
			Map<String,String>map=new HashMap<String, String>();
			map.put("k_username", "haha");
			map.put("k_permession", "普通用户");
			List<UserInfo> list=dao.getInfo(map);
			for(UserInfo user:list){
				System.out.println(user.getId()+"\t"+user.getUsername()+"\t"+user.getPassword());
			}
			*/
			//===========================================================
			/*
			//查询全部信息（分页）
			Page<UserInfo>page=PageHelper.startPage(3,3);
			dao.getAllByPage();//将查询的结果封装进page对象中
			System.out.println("第"+page.getPageNum()+"页getPageNum");
			System.out.println("本页显示"+page.size()+"条数据size");
			System.out.println("共有"+page.getPages()+"页getPages");
			System.out.println("每页显示"+page.getPageSize()+"条数据getPageSize");
			System.out.println("共"+page.getTotal()+"条数据getTotal");
			List<UserInfo> list=page.getResult();
			for(UserInfo user:list){
				System.out.println(user.getId()+"\t"+user.getUsername()+"\t"+user.getPassword());
			}
			*/
			//===========================================================
			/*
			//组合查询
			UserInfo userInfo=new UserInfo();
			//userInfo.setId(1L);
			userInfo.setUsername("cccda");
			List<UserInfo> list=dao.getUserInfo(userInfo);
			for(UserInfo user:list){
				System.out.println(user.getId()+"\t"+user.getUsername()+"\t"+user.getPassword());
			}
			*/
			//===========================================================
			
			//批量删除
			Long []ids={7L,8L};
			dao.delUsers(ids);
			session.commit();
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
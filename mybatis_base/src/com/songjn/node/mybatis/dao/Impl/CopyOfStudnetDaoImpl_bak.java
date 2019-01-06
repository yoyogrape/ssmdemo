package com.songjn.node.mybatis.dao.Impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.songjn.node.mybatis.dao.IStudentDao;
import com.songjn.node.mybatis.po.Student;

/**
 * 
 * @ClassName: CopyOfStudnetDaoImpl_bak
 * @Description: TODO(δʹ�ù�����֮ǰ)
 * @author songjn
 * @date 2018-9-8 ����03:28:34
 * 
 * 
 */
public class CopyOfStudnetDaoImpl_bak implements IStudentDao {

	public void insertStudnet(Student student) {
		try {
			// 1.�����������ļ�
			InputStream is = Resources.getResourceAsStream("mybatis.xml");
			// 2������SqlSessionFactory����
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
					.build(is);
			// 3������SqlSession����
			SqlSession sqlSession = sqlSessionFactory.openSession();
			// 4����ز���
			sqlSession.insert("insertStudnet", student);

			sqlSession.commit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void deleteStudentById(int id) {
		// TODO Auto-generated method stub
		
	}

	public void insertStudnetCacheId(Student student) {
		// TODO Auto-generated method stub
		
	}

	public List<Student> selectAllStudnets() {
		// TODO Auto-generated method stub
		return null;
	}

	public Map<String, Object> selectAllStudnetsMap() {
		// TODO Auto-generated method stub
		return null;
	}

	public Student selectStudnetById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Student> selectStudnetsByName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	public List<Student> selectStudnetsByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}


}

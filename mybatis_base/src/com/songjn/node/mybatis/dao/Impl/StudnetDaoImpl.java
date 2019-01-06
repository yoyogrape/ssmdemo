package com.songjn.node.mybatis.dao.Impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.songjn.node.mybatis.dao.IStudentDao;
import com.songjn.node.mybatis.po.Student;
import com.songjn.node.mybatis.utils.MybatisUtils;

/**
 * 
 * @ClassName: StudnetDaoImpl
 * @Description: TODO(使用工具类之后的代码)
 * @author songjn
 * @date 2018-9-8 下午03:33:11
 * 
 */
public class StudnetDaoImpl implements IStudentDao {

	private SqlSession sqlSession;

	public void insertStudnet(Student student) {
		try {
			sqlSession = MybatisUtils.getSqlSession();
			sqlSession.insert("insertStudnet", student);
			sqlSession.commit();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
	}

	public void insertStudnetCacheId(Student student) {
		try {
			sqlSession = MybatisUtils.getSqlSession();
			System.out.println("执行插入前的Student=" + student);
			sqlSession.insert("insertStudnetCacheId", student);
			System.out.println("执行插入后的Student=" + student);
			sqlSession.commit();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
	}

	public void deleteStudentById(int id) {
		try {
			sqlSession = MybatisUtils.getSqlSession();
			sqlSession.insert("deleteStudentById", id);
			sqlSession.commit();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
	}

	public void updateStudent(Student student) {
		try {
			sqlSession = MybatisUtils.getSqlSession();
			sqlSession.update("updateStudent", student);
			sqlSession.commit();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
	}

	public List<Student> selectAllStudnets() {
		List<Student> students = new ArrayList<Student>();
		try {
			sqlSession = MybatisUtils.getSqlSession();
			students = sqlSession.selectList("selectAllStudnets");
			sqlSession.commit();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
		return students;
	}

	public Map<String, Object> selectAllStudnetsMap() {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			sqlSession = MybatisUtils.getSqlSession();
			map = sqlSession.selectMap("selectAllStudnets", "name");
			sqlSession.commit();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
		return map;
	}

	public Student selectStudnetById(int id) {
		Student student;
		try {
			sqlSession = MybatisUtils.getSqlSession();
			student = sqlSession.selectOne("selectStudnetById", id);
			sqlSession.commit();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
		return student;
	}

	public List<Student> selectStudnetsByName(String name) {
		List<Student> students = new ArrayList<Student>();
		try {
			sqlSession = MybatisUtils.getSqlSession();
			students = sqlSession.selectList("selectStudnetsByName","%"+name+"%");
			sqlSession.commit();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
		return students;
	}

}

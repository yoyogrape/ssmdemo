package com.songjn.node.springjdbc.dao.impl;

import java.util.List;

import org.springframework.dao.support.DaoSupport;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.songjn.node.springjdbc.dao.IStudentDao;
import com.songjn.node.springjdbc.po.Student;
import com.songjn.node.springjdbc.service.impl.StudentRowMapper;

public class StudentDaoImpl extends JdbcDaoSupport implements IStudentDao {

	@Override
	public void insertStudnet(Student student) {
		String sql = "insert into student(name,age) value(?,?)";
		this.getJdbcTemplate().update(sql, student.getName(), student.getAge());
	}

	@Override
	public void deleteById(int id) {
		String sql = "delete from student where id=?";
		this.getJdbcTemplate().update(sql, id);
	}

	@Override
	public void updateStudent(Student student) {
		String sql = "update student set name=?,age=? where id=?";
		this.getJdbcTemplate().update(sql, student.getName(), student.getAge(),
				student.getId());
	}

	@Override
	public List<String> selectAllStudnetsName() {
		String sql = "select name from student";
		return this.getJdbcTemplate().queryForList(sql, String.class);
	}

	@Override
	public String selectStudnetNameById(int id) {
		String sql = "select name from student where id=?";
		return this.getJdbcTemplate().queryForObject(sql, String.class, id);
	}

	@Override
	public List<Student> selectAllStudnets() {
		String sql = "select id,name,age from student";
		return this.getJdbcTemplate().query(sql, new StudentRowMapper());
	}

	@Override
	public Student selectStudnetById(int id) {
		String sql = "select id,name,age from student where id=?";
		return this.getJdbcTemplate().queryForObject(sql,new StudentRowMapper(), id);
	}

}

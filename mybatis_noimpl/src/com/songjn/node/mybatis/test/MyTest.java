package com.songjn.node.mybatis.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.ls.LSException;

import com.songjn.node.mybatis.dao.IStudentDao;
import com.songjn.node.mybatis.po.Student;
import com.songjn.node.mybatis.utils.MybatisUtils;

/**
 * 去掉daoimpl实现类的代码
 */
public class MyTest {
	private IStudentDao dao;
	private SqlSession session;

	@Before
	public void before() {
		session = MybatisUtils.getSqlSession();
		dao = session.getMapper(IStudentDao.class);
	}

	@After
	public void after() {
		if (session != null) {
			session.close();
		}
	}

	@Test
	public void add() {// 执行插入方法
		dao.insertStudnet(new Student("小明", 12, 98));
		session.commit();
	}

	@Test
	public void addChche() {// 执行插入，插入前id=null，插入后id=非空。
		dao.insertStudnetCacheId(new Student("小明3333", 14, 12));
		// 执行插入前的Student=Student [age=14, id=0, name=小明3333, score=12.0]
		// 执行插入后的Student=Student [age=14, id=27, name=小明3333, score=12.0]
		session.commit();
	}

	@Test
	public void del() {
		dao.deleteStudentById(36);
		session.commit();
	}

	@Test
	public void update() {
		Student student = new Student("花花", 12, 77);
		student.setId(29);
		dao.updateStudent(student);
	}

	@Test
	public void select() {
		List<Student> list = dao.selectAllStudnets();
		for (Student student : list) {
			System.out.println(student);
		}
	}

	//返回值是map的查询
	@Test
	public void selectMap() {
		Map<String, Object> map = dao.selectAllStudnetsMap();
		System.out.println(map.get("xixi"));
	}

	//通过id查询
	@Test
	public void selectById() {
		System.out.println(dao.selectStudnetById(3));
	}
	//通过名字查询
	@Test
	public void selectByName() {
		List<Student> list = dao.selectStudnetsByName("小");
		for (Student student : list) {
			System.out.println(student);
		}
	}
	//多条件查询
	@Test
	public void selectByConditions() {
		Student stian=new Student("田七", 28, 87);//3、比田七成绩高
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("nameCon", "ge");//1、名字中有ge的。
		map.put("ageCon", 18);//2、年龄大于18的
		map.put("tianqi", stian);
		List<Student> list = dao.selectByConditions(map);
		for (Student student : list) {
			System.out.println(student);
		}
	}
	//动态sql<if>实现
	@Test
	public void selectDynamicSqlByIf() {
		//Student student=new Student("", 0, 87);//一个条件：成绩>87
		//Student student=new Student("", 28, 87);//两个条件:年龄>28，成绩>87
		Student student=new Student("李", 30, 87);//三个条件:姓李，年龄>28，成绩>87

		List<Student> list = dao.selectDynamicSqlByIf(student);
		for (Student s : list) {
			System.out.println(s);
		}
	}
	//动态sql<where>实现
	@Test
	public void selectDynamicSqlByWhere() {
		//Student student=new Student("", 0, 87);//一个条件：成绩>87
		//Student student=new Student("", 28, 87);//两个条件:年龄>28，成绩>87
		Student student=new Student("李", 30, 87);//三个条件:姓李，年龄>28，成绩>87
		
		List<Student> list = dao.selectDynamicSqlByWhere(student);
		for (Student s : list) {
			System.out.println(s);
		}
	}
	//<choose>标签的使用
	@Test
	public void selectDynamicSqlByChoose() {
		//Student student=new Student("", 0, 87);//一个条件：成绩>87
		Student student=new Student("", 28, 87);//两个条件:年龄>28，成绩>87
		//Student student=new Student("李", 30, 87);//三个条件:姓李，年龄>28，成绩>87
		
		List<Student> list = dao.selectDynamicSqlByChoose(student);
		for (Student s : list) {
			System.out.println(s);
		}
	}
	//<foreach>标签的使用(数组)
	@Test
	public void selectDynamicSqlByForeach() {
		//int [] ids={1,3,4};
		int [] ids={};
		List<Student> list = dao.selectDynamicSqlByForeach(ids);
		for (Student s : list) {
			
			System.out.println(s);
		}
	}
	//<foreach>标签的使用（list集合）
	@Test
	public void selectDynamicSqlByForeach2() {
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(4);
		List<Student> studnets = dao.selectDynamicSqlByForeach2(list);
		for (Student s : studnets) {
			System.out.println(s);
		}
	}
	//<foreach>标签的使用（list自定义类型集合）
	@Test
	public void selectDynamicSqlByForeach3() {
		List<Student> list=new ArrayList<Student>();
		list.add(new Student("ll",12,70));
		list.add(new Student("ss",12,80));
		List<Student> studnets = dao.selectDynamicSqlByForeach3(list);
		for (Student s : studnets) {
			System.out.println(s);
		}
	}
	//<sql>:sql片段的使用
	@Test
	public void selectDynamicSqlByForeach4() {
		List<Student> list=new ArrayList<Student>();
		list.add(new Student("ll",12,70));
		list.add(new Student("ss",12,80));
		List<Student> studnets = dao.selectDynamicSqlByForeach4(list);
		for (Student s : studnets) {
			System.out.println(s);
		}
	}
	
}
